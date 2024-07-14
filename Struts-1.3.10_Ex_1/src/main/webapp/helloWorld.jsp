<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<html>
<head>
<title>Hello Struts 1.3.10</title>
</head>
<body>
	<h1>
		<bean:write name="helloWorldForm" property="hello" />
	</h1>
</body>
</html>
