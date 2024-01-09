<%--
  Created by IntelliJ IDEA.
  User: forhe
  Date: 2024-01-09
  Time: 오후 2:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="userinfo" class="myapp.ch05.UserBean" scope="request"/>

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
  <title>Title</title>
</head>
<body>
<h2>Login Fail!</h2><hr>
사용자 아이디: <jsp:getProperty name="userinfo" property="userid"/> <br>
사용자 패스워드: <jsp:getProperty name="userinfo" property="password"/> <br>
에러 코드: <jsp:getProperty name="userinfo" property="error"/> <br>
</body>
</html>

