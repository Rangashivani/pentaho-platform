/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2029-07-20
 ******************************************************************************/


package org.pentaho.mantle.client.commands;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Command;
import org.pentaho.gwt.widgets.client.filechooser.RepositoryFile;
import org.pentaho.gwt.widgets.client.tabs.PentahoTabPanel;
import org.pentaho.mantle.client.events.EventBusUtil;
import org.pentaho.mantle.client.events.SolutionFileActionEvent;
import org.pentaho.mantle.client.events.SolutionFileHandler;
import org.pentaho.mantle.client.solutionbrowser.SolutionBrowserPanel;
import org.pentaho.mantle.client.solutionbrowser.fileproperties.FilePropertiesDialog;

import java.util.ArrayList;
import java.util.List;

public class ShareFileCommand implements Command {

  private FilePropertiesDialog.Tabs defaultTab = FilePropertiesDialog.Tabs.PERMISSION;

  private String moduleBaseURL = GWT.getModuleBaseURL();
  private String moduleName = GWT.getModuleName();
  private String contextURL = moduleBaseURL.substring( 0, moduleBaseURL.lastIndexOf( moduleName ) );
  private static final int MANAGE_ACLS = 3;

  private List<RepositoryFile> selectedList;

  public ShareFileCommand() {
  }

  private String solutionPath = null;

  public String getSolutionPath() {
    return solutionPath;
  }

  public void setSolutionPath( String solutionPath ) {
    this.solutionPath = solutionPath;
  }

  public void execute() {
    final SolutionBrowserPanel sbp = SolutionBrowserPanel.getInstance();
    if ( this.getSolutionPath() != null ) {
      selectedList = new ArrayList<RepositoryFile>();
      sbp.getFile( this.getSolutionPath(), new SolutionFileHandler() {
        @Override
        public void handle( RepositoryFile repositoryFile ) {
          selectedList.add( repositoryFile );
          performOperation();
        }
      } );
    } else {
      selectedList = sbp.getFilesListPanel().getRepositoryFiles();
      performOperation();
    }
  }

  public void performOperation() {

    final SolutionFileActionEvent event = new SolutionFileActionEvent();
    event.setAction( this.getClass().getName() );

    if ( selectedList != null && selectedList.size() == 1 ) {
      final RepositoryFile item = selectedList.get( 0 );

      // Checking if the user has access to manage permissions
      String url =
          contextURL
              + "api/repo/files/" + SolutionBrowserPanel.pathToId( item.getPath() ) + "/canAccess?permissions=" + MANAGE_ACLS; //$NON-NLS-1$ //$NON-NLS-2$
      RequestBuilder builder = new RequestBuilder( RequestBuilder.GET, url );
      try {
        builder.setHeader( "If-Modified-Since", "01 Jan 1970 00:00:00 GMT" );
        builder.sendRequest( null, new RequestCallback() {

          public void onError( Request request, Throwable exception ) {
            FilePropertiesDialog dialog =
                new FilePropertiesDialog( item, new PentahoTabPanel(), null, defaultTab, false );
            dialog.showTab( defaultTab );
            dialog.center();

            event.setMessage( exception.getMessage() );
            EventBusUtil.EVENT_BUS.fireEvent( event );
          }

          public void onResponseReceived( Request request, Response response ) {
            FilePropertiesDialog dialog =
                new FilePropertiesDialog( item, new PentahoTabPanel(), null, defaultTab, Boolean.parseBoolean( response
                    .getText() ) );
            dialog.showTab( FilePropertiesDialog.Tabs.PERMISSION );
            dialog.center();

            event.setMessage( "Success" );
            EventBusUtil.EVENT_BUS.fireEvent( event );
          }
        } );
      } catch ( RequestException e ) {
        FilePropertiesDialog dialog = new FilePropertiesDialog( item, new PentahoTabPanel(), null, defaultTab, false );
        dialog.showTab( FilePropertiesDialog.Tabs.PERMISSION );
        dialog.center();

        event.setMessage( e.getMessage() );
        EventBusUtil.EVENT_BUS.fireEvent( event );
      }

    }
  }

}
