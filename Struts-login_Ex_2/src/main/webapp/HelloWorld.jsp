<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
</head>
<body>
	<h1>
	   Google App Engine + Struts 1.x example
	</h1>
	<h2><bean:write name="helloWorldForm" property="message" /></h2>
</body>
</html>