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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.31 at 02:27:39 PM EDT 
//

package org.pentaho.platform.plugin.services.importer.mimeType.bindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MimeTypeDefinitionsDto complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MimeTypeDefinitionsDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MimeTypeDefinition" type="{http://www.pentaho.com/schema/}MimeTypeDefinitionDto" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "MimeTypeDefinitionsDto", propOrder = { "mimeTypeDefinition" } )
public class MimeTypeDefinitionsDto {

  @XmlElement( name = "MimeTypeDefinition", required = true )
  protected List<MimeTypeDefinitionDto> mimeTypeDefinition;

  /**
   * Gets the value of the mimeTypeDefinition property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the mimeTypeDefinition property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getMimeTypeDefinition().add( newItem );
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link MimeTypeDefinitionDto }
   * 
   * 
   */
  public List<MimeTypeDefinitionDto> getMimeTypeDefinition() {
    if ( mimeTypeDefinition == null ) {
      mimeTypeDefinition = new ArrayList<MimeTypeDefinitionDto>();
    }
    return this.mimeTypeDefinition;
  }

}
