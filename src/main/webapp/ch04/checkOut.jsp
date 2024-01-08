<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: forhe
  Date: 2024-01-08
  Time: 오후 3:08
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
<% request.setCharacterEncoding("UTF-8"); %>
<body>
<h2> <%= session.getAttribute("username") %>님이 선택한 상품목록</h2>
<%
    ArrayList<?> list = (ArrayList<?>) session.getAttribute("productlist");
    if (list == null) out.println("선택한 상품이 없습니다!");
    else
        for (Object product: list)
            out.println(product + "<br>");
%>
</body>
</html>
