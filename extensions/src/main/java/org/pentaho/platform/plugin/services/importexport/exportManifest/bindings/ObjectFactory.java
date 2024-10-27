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


//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.25 at 11:25:28 AM EDT 
//

package org.pentaho.platform.plugin.services.importexport.exportManifest.bindings;

import org.pentaho.platform.api.scheduler.JobScheduleParam;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * org.pentaho.platform.plugin.services.importexport.exportManifest.bindings package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

  private static final QName _IncrementalRecurrence_QNAME = new QName( "http://www.pentaho.com/schema/",
      "incrementalRecurrence" );
  private static final QName _JobScheduleRequest_QNAME = new QName( "http://www.pentaho.com/schema/",
      "jobScheduleRequest" );
  private static final QName _QualifiedDayOfMonth_QNAME = new QName( "http://www.pentaho.com/schema/",
      "qualifiedDayOfMonth" );
  private static final QName _ExportManifest_QNAME = new QName( "http://www.pentaho.com/schema/", "ExportManifest" );
  private static final QName _SimpleJobTrigger_QNAME =
    new QName( "http://www.pentaho.com/schema/", "simpleJobTrigger" );
  private static final QName _DatabaseType_QNAME = new QName( "http://www.pentaho.com/schema/", "databaseType" );
  private static final QName _CronJobTrigger_QNAME = new QName( "http://www.pentaho.com/schema/", "cronJobTrigger" );
  private static final QName _RecurrenceList_QNAME = new QName( "http://www.pentaho.com/schema/", "recurrenceList" );
  private static final QName _SequentialRecurrence_QNAME = new QName( "http://www.pentaho.com/schema/",
      "sequentialRecurrence" );
  private static final QName _PartitionDatabaseMeta_QNAME = new QName( "http://www.pentaho.com/schema/",
      "partitionDatabaseMeta" );
  private static final QName _DatabaseConnection_QNAME = new QName( "http://www.pentaho.com/schema/",
      "databaseConnection" );
  private static final QName _ComplexJobTriggerProxy_QNAME = new QName( "http://www.pentaho.com/schema/",
      "complexJobTriggerProxy" );
  private static final QName _QualifiedDayOfWeek_QNAME = new QName( "http://www.pentaho.com/schema/",
      "qualifiedDayOfWeek" );
  private static final QName _ComplexJobTrigger_QNAME = new QName( "http://www.pentaho.com/schema/",
      "complexJobTrigger" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
   * org.pentaho.platform.plugin.services.importexport.exportManifest.bindings
   * 
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link EntityAcl }
   * 
   */
  public EntityAcl createEntityAcl() {
    return new EntityAcl();
  }

  /**
   * Create an instance of {@link Parameters }
   * 
   */
  public Parameters createParameters() {
    return new Parameters();
  }

  /**
   * Create an instance of {@link Parameters.Entries }
   * 
   */
  public Parameters.Entries createParametersEntries() {
    return new Parameters.Entries();
  }

  /**
   * Create an instance of {@link ComplexJobTrigger }
   * 
   */
  public ComplexJobTrigger createComplexJobTrigger() {
    return new ComplexJobTrigger();
  }

  /**
   * Create an instance of {@link DatabaseConnection }
   * 
   */
  public DatabaseConnection createDatabaseConnection() {
    return new DatabaseConnection();
  }

  /**
   * Create an instance of {@link DatabaseConnection.ExtraOptions }
   * 
   */
  public DatabaseConnection.ExtraOptions createDatabaseConnectionExtraOptions() {
    return new DatabaseConnection.ExtraOptions();
  }

  /**
   * Create an instance of {@link DatabaseConnection.ConnectionPoolingProperties }
   * 
   */
  public DatabaseConnection.ConnectionPoolingProperties createDatabaseConnectionConnectionPoolingProperties() {
    return new DatabaseConnection.ConnectionPoolingProperties();
  }

  /**
   * Create an instance of {@link DatabaseConnection.Attributes }
   * 
   */
  public DatabaseConnection.Attributes createDatabaseConnectionAttributes() {
    return new DatabaseConnection.Attributes();
  }

  /**
   * Create an instance of {@link ExportManifestDto }
   * 
   */
  public ExportManifestDto createExportManifestDto() {
    return new ExportManifestDto();
  }

  /**
   * Create an instance of {@link DatabaseType }
   * 
   */
  public DatabaseType createDatabaseType() {
    return new DatabaseType();
  }

  /**
   * Create an instance of {@link SimpleJobTrigger }
   * 
   */
  public SimpleJobTrigger createSimpleJobTrigger() {
    return new SimpleJobTrigger();
  }

  /**
   * Create an instance of {@link QualifiedDayOfMonth }
   * 
   */
  public QualifiedDayOfMonth createQualifiedDayOfMonth() {
    return new QualifiedDayOfMonth();
  }

  /**
   * Create an instance of {@link JobScheduleRequest }
   * 
   */
  public JobScheduleRequest createJobScheduleRequest() {
    return new JobScheduleRequest();
  }

  /**
   * Create an instance of {@link IncrementalRecurrence }
   * 
   */
  public IncrementalRecurrence createIncrementalRecurrence() {
    return new IncrementalRecurrence();
  }

  /**
   * Create an instance of {@link PartitionDatabaseMeta }
   * 
   */
  public PartitionDatabaseMeta createPartitionDatabaseMeta() {
    return new PartitionDatabaseMeta();
  }

  /**
   * Create an instance of {@link SequentialRecurrence }
   * 
   */
  public SequentialRecurrence createSequentialRecurrence() {
    return new SequentialRecurrence();
  }

  /**
   * Create an instance of {@link RecurrenceList }
   * 
   */
  public RecurrenceList createRecurrenceList() {
    return new RecurrenceList();
  }

  /**
   * Create an instance of {@link CronJobTrigger }
   * 
   */
  public CronJobTrigger createCronJobTrigger() {
    return new CronJobTrigger();
  }

  /**
   * Create an instance of {@link QualifiedDayOfWeek }
   * 
   */
  public QualifiedDayOfWeek createQualifiedDayOfWeek() {
    return new QualifiedDayOfWeek();
  }

  /**
   * Create an instance of {@link ComplexJobTriggerProxy }
   * 
   */
  public ComplexJobTriggerProxy createComplexJobTriggerProxy() {
    return new ComplexJobTriggerProxy();
  }

  /**
   * Create an instance of {@link ExportManifestProperty }
   * 
   */
  public ExportManifestProperty createExportManifestProperty() {
    return new ExportManifestProperty();
  }

  /**
   * Create an instance of {@link EntityMetaData }
   * 
   */
  public EntityMetaData createEntityMetaData() {
    return new EntityMetaData();
  }

  /**
   * Create an instance of {@link CustomProperty }
   * 
   */
  public CustomProperty createCustomProperty() {
    return new CustomProperty();
  }

  /**
   * Create an instance of {@link ExportManifestMetadata }
   * 
   */
  public ExportManifestMetadata createExportManifestMetadata() {
    return new ExportManifestMetadata();
  }

  /**
   * Create an instance of {@link ExportManifestEntityDto }
   * 
   */
  public ExportManifestEntityDto createExportManifestEntityDto() {
    return new ExportManifestEntityDto();
  }

  /**
   * Create an instance of {@link ExportManifestMondrian }
   * 
   */
  public ExportManifestMondrian createExportManifestMondrian() {
    return new ExportManifestMondrian();
  }

  /**
   * Create an instance of {@link JobScheduleParam }
   * 
   */
  public JobScheduleParam createJobScheduleParam() {
    return new JobScheduleParam();
  }

  /**
   * Create an instance of {@link EntityAcl.Aces }
   * 
   */
  public EntityAcl.Aces createEntityAclAces() {
    return new EntityAcl.Aces();
  }

  /**
   * Create an instance of {@link Parameters.Entries.Entry }
   * 
   */
  public Parameters.Entries.Entry createParametersEntriesEntry() {
    return new Parameters.Entries.Entry();
  }

  /**
   * Create an instance of {@link ComplexJobTrigger.DayOfMonthRecurrences }
   * 
   */
  public ComplexJobTrigger.DayOfMonthRecurrences createComplexJobTriggerDayOfMonthRecurrences() {
    return new ComplexJobTrigger.DayOfMonthRecurrences();
  }

  /**
   * Create an instance of {@link ComplexJobTrigger.DayOfWeekRecurrences }
   * 
   */
  public ComplexJobTrigger.DayOfWeekRecurrences createComplexJobTriggerDayOfWeekRecurrences() {
    return new ComplexJobTrigger.DayOfWeekRecurrences();
  }

  /**
   * Create an instance of {@link ComplexJobTrigger.HourlyRecurrences }
   * 
   */
  public ComplexJobTrigger.HourlyRecurrences createComplexJobTriggerHourlyRecurrences() {
    return new ComplexJobTrigger.HourlyRecurrences();
  }

  /**
   * Create an instance of {@link ComplexJobTrigger.MinuteRecurrences }
   * 
   */
  public ComplexJobTrigger.MinuteRecurrences createComplexJobTriggerMinuteRecurrences() {
    return new ComplexJobTrigger.MinuteRecurrences();
  }

  /**
   * Create an instance of {@link ComplexJobTrigger.MonthlyRecurrences }
   * 
   */
  public ComplexJobTrigger.MonthlyRecurrences createComplexJobTriggerMonthlyRecurrences() {
    return new ComplexJobTrigger.MonthlyRecurrences();
  }

  /**
   * Create an instance of {@link ComplexJobTrigger.SecondRecurrences }
   * 
   */
  public ComplexJobTrigger.SecondRecurrences createComplexJobTriggerSecondRecurrences() {
    return new ComplexJobTrigger.SecondRecurrences();
  }

  /**
   * Create an instance of {@link ComplexJobTrigger.YearlyRecurrences }
   * 
   */
  public ComplexJobTrigger.YearlyRecurrences createComplexJobTriggerYearlyRecurrences() {
    return new ComplexJobTrigger.YearlyRecurrences();
  }

  /**
   * Create an instance of {@link DatabaseConnection.ExtraOptions.Entry }
   * 
   */
  public DatabaseConnection.ExtraOptions.Entry createDatabaseConnectionExtraOptionsEntry() {
    return new DatabaseConnection.ExtraOptions.Entry();
  }

  /**
   * Create an instance of {@link DatabaseConnection.ConnectionPoolingProperties.Entry }
   * 
   */
  public DatabaseConnection.ConnectionPoolingProperties.Entry createDatabaseConnectionConnectionPoolingPropertiesEntry() {
    return new DatabaseConnection.ConnectionPoolingProperties.Entry();
  }

  /**
   * Create an instance of {@link DatabaseConnection.Attributes.Entry }
   * 
   */
  public DatabaseConnection.Attributes.Entry createDatabaseConnectionAttributesEntry() {
    return new DatabaseConnection.Attributes.Entry();
  }

  /**
   * Create an instance of {@link ExportManifestDto.ExportManifestInformation }
   * 
   */
  public ExportManifestDto.ExportManifestInformation createExportManifestDtoExportManifestInformation() {
    return new ExportManifestDto.ExportManifestInformation();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link IncrementalRecurrence }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "incrementalRecurrence" )
  public JAXBElement<IncrementalRecurrence> createIncrementalRecurrence( IncrementalRecurrence value ) {
    return new JAXBElement<IncrementalRecurrence>( _IncrementalRecurrence_QNAME, IncrementalRecurrence.class, null,
        value );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link JobScheduleRequest }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "jobScheduleRequest" )
  public JAXBElement<JobScheduleRequest> createJobScheduleRequest( JobScheduleRequest value ) {
    return new JAXBElement<JobScheduleRequest>( _JobScheduleRequest_QNAME, JobScheduleRequest.class, null, value );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link QualifiedDayOfMonth }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "qualifiedDayOfMonth" )
  public JAXBElement<QualifiedDayOfMonth> createQualifiedDayOfMonth( QualifiedDayOfMonth value ) {
    return new JAXBElement<QualifiedDayOfMonth>( _QualifiedDayOfMonth_QNAME, QualifiedDayOfMonth.class, null, value );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ExportManifestDto }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "ExportManifest" )
  public JAXBElement<ExportManifestDto> createExportManifest( ExportManifestDto value ) {
    return new JAXBElement<ExportManifestDto>( _ExportManifest_QNAME, ExportManifestDto.class, null, value );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SimpleJobTrigger }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "simpleJobTrigger" )
  public JAXBElement<SimpleJobTrigger> createSimpleJobTrigger( SimpleJobTrigger value ) {
    return new JAXBElement<SimpleJobTrigger>( _SimpleJobTrigger_QNAME, SimpleJobTrigger.class, null, value );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseType }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "databaseType" )
  public JAXBElement<DatabaseType> createDatabaseType( DatabaseType value ) {
    return new JAXBElement<DatabaseType>( _DatabaseType_QNAME, DatabaseType.class, null, value );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CronJobTrigger }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "cronJobTrigger" )
  public JAXBElement<CronJobTrigger> createCronJobTrigger( CronJobTrigger value ) {
    return new JAXBElement<CronJobTrigger>( _CronJobTrigger_QNAME, CronJobTrigger.class, null, value );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link RecurrenceList }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "recurrenceList" )
  public JAXBElement<RecurrenceList> createRecurrenceList( RecurrenceList value ) {
    return new JAXBElement<RecurrenceList>( _RecurrenceList_QNAME, RecurrenceList.class, null, value );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SequentialRecurrence }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "sequentialRecurrence" )
  public JAXBElement<SequentialRecurrence> createSequentialRecurrence( SequentialRecurrence value ) {
    return new JAXBElement<SequentialRecurrence>( _SequentialRecurrence_QNAME,
      SequentialRecurrence.class, null, value );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PartitionDatabaseMeta }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "partitionDatabaseMeta" )
  public JAXBElement<PartitionDatabaseMeta> createPartitionDatabaseMeta( PartitionDatabaseMeta value ) {
    return new JAXBElement<PartitionDatabaseMeta>( _PartitionDatabaseMeta_QNAME, PartitionDatabaseMeta.class, null,
        value );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseConnection }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "databaseConnection" )
  public JAXBElement<DatabaseConnection> createDatabaseConnection( DatabaseConnection value ) {
    return new JAXBElement<DatabaseConnection>( _DatabaseConnection_QNAME, DatabaseConnection.class, null, value );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ComplexJobTriggerProxy }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "complexJobTriggerProxy" )
  public JAXBElement<ComplexJobTriggerProxy> createComplexJobTriggerProxy( ComplexJobTriggerProxy value ) {
    return new JAXBElement<ComplexJobTriggerProxy>( _ComplexJobTriggerProxy_QNAME, ComplexJobTriggerProxy.class, null,
        value );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link QualifiedDayOfWeek }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "qualifiedDayOfWeek" )
  public JAXBElement<QualifiedDayOfWeek> createQualifiedDayOfWeek( QualifiedDayOfWeek value ) {
    return new JAXBElement<QualifiedDayOfWeek>( _QualifiedDayOfWeek_QNAME, QualifiedDayOfWeek.class, null, value );
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ComplexJobTrigger }{@code >}
   * 
   */
  @XmlElementDecl( namespace = "http://www.pentaho.com/schema/", name = "complexJobTrigger" )
  public JAXBElement<ComplexJobTrigger> createComplexJobTrigger( ComplexJobTrigger value ) {
    return new JAXBElement<ComplexJobTrigger>( _ComplexJobTrigger_QNAME, ComplexJobTrigger.class, null, value );
  }

}
