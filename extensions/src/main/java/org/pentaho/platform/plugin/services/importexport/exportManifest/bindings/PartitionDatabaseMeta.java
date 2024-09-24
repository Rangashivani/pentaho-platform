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
// Generated on: 2013.07.25 at 11:25:28 AM EDT 
//

package org.pentaho.platform.plugin.services.importexport.exportManifest.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for partitionDatabaseMeta complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partitionDatabaseMeta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partitionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "partitionDatabaseMeta", propOrder = { "databaseName", "hostname", "partitionId", "password", "port",
    "username" } )
public class PartitionDatabaseMeta {

  protected String databaseName;
  protected String hostname;
  protected String partitionId;
  protected String password;
  protected String port;
  protected String username;

  /**
   * Gets the value of the databaseName property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * Sets the value of the databaseName property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setDatabaseName( String value ) {
    this.databaseName = value;
  }

  /**
   * Gets the value of the hostname property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * Sets the value of the hostname property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setHostname( String value ) {
    this.hostname = value;
  }

  /**
   * Gets the value of the partitionId property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getPartitionId() {
    return partitionId;
  }

  /**
   * Sets the value of the partitionId property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setPartitionId( String value ) {
    this.partitionId = value;
  }

  /**
   * Gets the value of the password property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getPassword() {
    return password;
  }

  /**
   * Sets the value of the password property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setPassword( String value ) {
    this.password = value;
  }

  /**
   * Gets the value of the port property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getPort() {
    return port;
  }

  /**
   * Sets the value of the port property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setPort( String value ) {
    this.port = value;
  }

  /**
   * Gets the value of the username property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getUsername() {
    return username;
  }

  /**
   * Sets the value of the username property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setUsername( String value ) {
    this.username = value;
  }

}
