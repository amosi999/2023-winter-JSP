<%--
  Created by IntelliJ IDEA.
  User: forhe
  Date: 2024-01-09
  Time: 오후 3:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="product" class="myapp.ch06.Product" scope="session" />

<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        body {
            text-align: center;
        }
    </style>
</head>
<body>
<h2>EL 예제 - 상품 목록</h2>
<hr>
<form name="form1" method="post" action="ProductSel.jsp">
    <select name="sel">
        <%
            for (String item : product.getList()) {
                out.println("<option>" + item + "</option>");
            }
        %>
    </select>
    <input type="submit" value="선택">
</form>

</body>
</html>
