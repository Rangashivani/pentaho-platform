/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2028-08-13
 ******************************************************************************/

package org.pentaho.platform.web.http.filters;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.HttpMethod;
import java.io.IOException;

public class PreFlightReportingFilter implements Filter {

  public void init( FilterConfig filterConfig ) throws ServletException {
  }

  public void destroy() {
  }

  public void doFilter( ServletRequest request, ServletResponse response, FilterChain chain ) throws IOException,
    ServletException {
    HttpServletRequest httpRequest = (HttpServletRequest) request;

    if ( isPreFlight( httpRequest ) ) {
      final HttpServletResponse servletResponse = (HttpServletResponse) response;
      servletResponse.sendError( HttpServletResponse.SC_METHOD_NOT_ALLOWED );
    } else {
      chain.doFilter( request, response );
    }
  }

  private boolean isPreFlight( final HttpServletRequest request ) {
    return ( HttpMethod.OPTIONS.equals( request.getMethod() ) || HttpMethod.HEAD.equals( request.getMethod() ) );
  }

}
