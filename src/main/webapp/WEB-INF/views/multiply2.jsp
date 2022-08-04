<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 31.07.2022
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<style>
  table {
    border-collapse: collapse;
  }
  table, th, td {
    border: 1px solid grey;
  }
  th, td {
    text-align: center;
    padding: 6px;
  }
  tr:nth-child(even) {
    background-color: #f2f2f2;
  }
</style>
<table>
  <tr>
    <th>x</th>
    <c:forEach varStatus="loop" begin="1" end="${cols}">
      <th>${loop.index}</th>
    </c:forEach>
  </tr>
  <c:forEach varStatus="loop1" begin="1" end="${rows}">
    <tr>
      <th>${loop1.index}</th>
      <c:forEach varStatus="loop2" begin="1" end="${cols}">
        <td>${loop1.count * loop2.count}</td>
      </c:forEach>
    </tr>
  </c:forEach>
</table>
</body>
</html>
