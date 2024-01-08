<%@ page import="myapp.ch05.LoginManager" %><%--
  Created by IntelliJ IDEA.
  User: forhe
  Date: 2024-01-08
  Time: 오후 4:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<jsp:useBean id="user" class="myapp.ch05.UserBean" scope="request" />
<jsp:setProperty name="user" property="*" />

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
        body {
            text-align: center;
        }
    </style>
    <title>Title</title>
</head>
<body>
<h2>로그인 예제</h2>
<hr>
<%
    LoginManager loginManager = new LoginManager();
    if (loginManager.authenticate(user)) {
        out.println("Login Success!");
    } else {
        out.println("Login Fail");
    }
%>
<hr>
사용자 아이디: <jsp:getProperty name="user" property="userid"/> <br>
사용자 패스워드: <jsp:getProperty name="user" property="password"/> <br>
사용자 이메일: <jsp:getProperty name="user" property="email"/>

</body>
</html>
