<%--
  Created by IntelliJ IDEA.
  User: forhe
  Date: 2024-01-08
  Time: 오후 3:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         import="java.util.ArrayList"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    String product = request.getParameter("product");
    ArrayList<String> list = (ArrayList<String>) session.getAttribute("productlist");
    if (list == null) list = new ArrayList<String>();
    list.add(product);
    session.setAttribute("productlist", list);
    out.println(product + "이(가) 추가되었습니다.");
%>

</body>
</html>
