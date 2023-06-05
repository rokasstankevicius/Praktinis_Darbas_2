<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format"
                version="1.0">
<xsl:output encoding="UTF-8" indent="yes" method="xml" standalone="no" omit-xml-declaration="no"/>
    <xsl:template match="/">
	<fo:root language="EN">
            <fo:layout-master-set>
                <fo:simple-page-master master-name="A4-portrait" page-height="297mm"
                                       page-width="210mm" margin-top="5mm"
                                       margin-bottom="5mm" margin-left="5mm"
                                       margin-right="5mm">
                    <fo:region-body margin-top="25mm" margin-bottom="20mm"/>
                    <fo:region-before region-name="xsl-region-before" extent="25mm" display-align="before"
                                      precedence="true"/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            <fo:page-sequence master-reference="A4-portrait">
				<fo:static-content flow-name="xsl-region-before" text-align="center">
					<fo:block>User Data</fo:block>
				</fo:static-content>
				
                <fo:flow flow-name="xsl-region-body" border-collapse="collapse" reference-orientation="0">
				<fo:block text-align="left">
					Username: <xsl:value-of select="/UserData/username"/>
				</fo:block>
				<fo:block></fo:block>
				<fo:block text-align="left">
					Deticated Servers:
				</fo:block>
				<fo:block text-align="center">
                        <fo:table table-layout="fixed" width="95%" font-size="10pt"
                                  border-color="grey" border-width="0.1mm"
                                  border-style="solid" text-align="center"
                                  display-align="center" space-after="5mm">
                            <fo:table-column column-width="proportional-column-width(20)"/>
                            <fo:table-column column-width="proportional-column-width(20)"/>
                            <fo:table-column column-width="proportional-column-width(50)"/>
                            <fo:table-column column-width="proportional-column-width(40)"/>
                            <fo:table-column column-width="proportional-column-width(40)"/>
                            <fo:table-body font-size="95%">
                                <fo:table-row height="8mm" border-color="grey"
                                              border-width="0.1mm" border-style="solid"
                                              text-align="start" display-align="center"
                                              space-after="5mm">
                                    <fo:table-cell>
                                        <fo:block>ID</fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>StorageSpace</fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>CPU</fo:block>
                                    </fo:table-cell>

                                    <fo:table-cell>
                                        <fo:block>RAM</fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>OS</fo:block>
                                    </fo:table-cell>
                                </fo:table-row>
                                <xsl:for-each select="/UserData/userPackage/dedicatedServers">
                                    <fo:table-row text-align="start">
                                        <fo:table-cell>
                                            <fo:block>
                                                <xsl:value-of select="id"/>
                                            </fo:block>
                                        </fo:table-cell>
                                        <fo:table-cell>
                                            <fo:block>
                                                <xsl:value-of select="storageSpace"/> TB
                                            </fo:block>
                                        </fo:table-cell>
                                        <fo:table-cell>
                                            <fo:block>
                                                <xsl:value-of select="cpu"/>
                                            </fo:block>
                                        </fo:table-cell>
                                        <fo:table-cell>
                                            <fo:block>
                                                <xsl:value-of select="ram"/>
                                            </fo:block>
                                        </fo:table-cell>
                                        <fo:table-cell>
                                            <fo:block>
                                                <xsl:value-of select="os"/>
                                            </fo:block>
                                        </fo:table-cell>
                                    </fo:table-row>
                                </xsl:for-each>
                            </fo:table-body>
                        </fo:table>
                    </fo:block>
					
					<fo:block text-align="left">
						Cloud Servers:
					</fo:block>
					<fo:block text-align="center">
                        <fo:table table-layout="fixed" width="95%" font-size="10pt"
                                  border-color="grey" border-width="0.1mm"
                                  border-style="solid" text-align="center"
                                  display-align="center" space-after="5mm">
                            <fo:table-column column-width="proportional-column-width(20)"/>
                            <fo:table-column column-width="proportional-column-width(20)"/>
                            <fo:table-column column-width="proportional-column-width(20)"/>
                            <fo:table-column column-width="proportional-column-width(40)"/>
                            <fo:table-body font-size="95%">
                                <fo:table-row height="8mm" border-color="grey"
                                              border-width="0.1mm" border-style="solid"
                                              text-align="start" display-align="center"
                                              space-after="5mm">
                                    <fo:table-cell>
                                        <fo:block>ID</fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>vCores</fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>StorageSpace</fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>RAM</fo:block>
                                    </fo:table-cell>
                                </fo:table-row>
                                <xsl:for-each select="/UserData/userPackage/cloudServers">
                                    <fo:table-row text-align="start">
                                        <fo:table-cell>
                                            <fo:block>
                                                <xsl:value-of select="id"/>
                                            </fo:block>
                                        </fo:table-cell>
                                        <fo:table-cell>
                                            <fo:block>
                                                <xsl:value-of select="vCores"/>
                                            </fo:block>
                                        </fo:table-cell>
                                        <fo:table-cell>
                                            <fo:block>
                                                <xsl:value-of select="storageSpace"/> GB
                                            </fo:block>
                                        </fo:table-cell>
                                        <fo:table-cell>
                                            <fo:block>
                                                <xsl:value-of select="ram"/>
                                            </fo:block>
                                        </fo:table-cell>
                                    </fo:table-row>
                                </xsl:for-each>
                            </fo:table-body>
                        </fo:table>
                    </fo:block>
				</fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
</xsl:stylesheet>
