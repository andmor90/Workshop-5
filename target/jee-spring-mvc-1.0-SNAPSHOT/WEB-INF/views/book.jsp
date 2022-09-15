<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 15.09.2022
  Time: 08:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>

<table border="1">
    <thead>
    <th>isbn</th>
    <th>title</th>
    <th>author</th>
    <th>actions</th>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td><c:out value="${book.isbn}"/></td>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.author.firstName} ${book.author.lastName}"/></td>
            <td>
                <a href="<c:url value="/admin/books/edit/${book.id}"/>">Edit</a>
                <a href="<c:url value="/admin/books/delete/${book.id}"/>">Delete</a>
                <a href="<c:url value="/admin/books/show/${book.id}"/>">Show</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<a href="<c:url value='/admin/books/add'/>">Add book</a> <br>
</body>
</html>


