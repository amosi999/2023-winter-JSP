<%--
  Created by IntelliJ IDEA.
  User: forhe
  Date: 2024-01-08
  Time: 오후 2:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            text-align: center;
        }
    </style>
</head>
<%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("username");
    session.setAttribute("username", name);
%>
<body>
<h2>상품 선택</h2>
<%= name %> 님이 로그인한 상태입니다.
<form method=post action=addProduct.jsp>
    <select name=product>
        <option>apple</option>
        <option>orange</option>
        <option>lemon</option>
    </select>
    <input type=submit value="추가" />
</form>
<a href=checkOut.jsp>계산</a>
</body>
</html>
