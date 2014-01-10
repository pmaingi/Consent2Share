<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns="urn:hl7-org:v3" xmlns:hl7="urn:hl7-org:v3" xmlns:sdtc="urn:hl7-org:sdtc"    
    version="2.0">
    
    <xsl:output method="xml" version="1.0" indent="yes" encoding="UTF-8"/> 
    
    <xsl:template match="/">
 
        <PRPA_IN201309UV02 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
            xsi:schemaLocation="urn:hl7-org:v3 ../schema/HL7V3/NE2008/multicacheschemas/PRPA_IN201309UV02.xsd"
            xmlns="urn:hl7-org:v3" ITSVersion="XML_1.0">
            
            <id root="2220c1c4-87ef-11dc-b865-3603d6866807"/>
            <creationTime value="20070810140900"/>
            <interactionId root="2.16.840.1.113883.1.6" extension="PRPA_IN201309UV02"/>
            <processingCode code="P"/>
            <processingModeCode code="T"/>
            <acceptAckCode code="AL"/>
            <receiver typeCode="RCV">
                <device classCode="DEV" determinerCode="INSTANCE">
                    <id root="1.2.840.114350.1.13.99999.4567"/>
                    <telecom value="https://example.org/PIXQuery"/>
                </device>
            </receiver>
            <sender typeCode="SND">
                <device classCode="DEV" determinerCode="INSTANCE">
                    <id root="1.2.840.114350.1.13.99998.8734"/>
                </device>
            </sender>
            <controlActProcess classCode="CACT" moodCode="EVN">
                <code code="PRPA_TE201309UV02" codeSystem="2.16.840.1.113883.1.6"/>
                <authorOrPerformer typeCode="AUT">
                    <assignedPerson classCode="ASSIGNED">
                        <id root="2.16.840.1.113883.3.72.5.9.1" extension="{/hl7:ClinicalDocument/hl7:recordTarget/hl7:patientRole/hl7:id/@extension}"/>
                    </assignedPerson>
                </authorOrPerformer>
                <queryByParameter>
                    <queryId root="1.2.840.114350.1.13.99999.4567.34" extension="018499884245"/>
                    <statusCode code="new"/>
                    <responsePriorityCode code="I"/>
                    <parameterList>
<!--                         <dataSource>
                            <value root="2.16.840.1.113883.4.357"/>
                            <semanticsText>DataSource.id</semanticsText>
                        </dataSource> -->
                        <patientIdentifier>
                            <value root="2.16.840.1.113883.3.72.5.9.1" extension="{/hl7:ClinicalDocument/hl7:recordTarget/hl7:patientRole/hl7:id/@extension}"/>
                            <semanticsText>Patient.Id</semanticsText>
                        </patientIdentifier>
                    </parameterList>
                </queryByParameter>
            </controlActProcess>
        </PRPA_IN201309UV02>           
    </xsl:template>  
    
</xsl:stylesheet>