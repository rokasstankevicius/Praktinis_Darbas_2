<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<head>
	<meta charset="utf-8" />
	<title>User Info</title>
</head>
<body>
	<h1>User Info</h1>
	Username: <xsl:value-of select="/UserData/username"/>
	<p/>
	Dedicated Servers: 
	<table style="width:100%:" border="1">
		<tr>
			<th>ID</th>
			<th>StorageSpace</th>
			<th>CPU</th>
			<th>RAM</th>
			<th>OS</th>
		</tr>
		<xsl:for-each select="/UserData/userPackage/dedicatedServers">
		<tr>
			<td><xsl:value-of select="id"/></td>
			<td><xsl:value-of select="storageSpace"/></td>
			<td><xsl:value-of select="cpu"/></td>
			<td><xsl:value-of select="ram"/></td>
			<td><xsl:value-of select="os"/></td>
		</tr>
		</xsl:for-each>
	</table>
	<p/>
	Cloud Servers:
	<table style="width:100%:" border="1">
		<tr>
			<th>ID</th>
			<th>vCores</th>
			<th>StorageSpace</th>
			<th>RAM</th>
		</tr>
		<xsl:for-each select="/UserData/userPackage/cloudServers">
		<tr>
			<td><xsl:value-of select="id"/></td>
			<td><xsl:value-of select="vCores"/></td>
			<td><xsl:value-of select="storageSpace"/></td>
			<td><xsl:value-of select="ram"/></td>
		</tr>
		</xsl:for-each>
	</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
