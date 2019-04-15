<%--
  Created by IntelliJ IDEA.
  User: chewi
  Date: 15/03/2019
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="personn" scope="request" type="lab.mvc.model.Personn"/>
<html>
<head>
    <title>Old</title>
</head>
<body>
${personn.firstName} <br>
${personn.lastName} <br>
${personn.gender} <br>
${personn.birthDate}
</body>
</html>
