<%--
  Created by IntelliJ IDEA.
  User: andrzej
  Date: 15.09.2022
  Time: 08:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Book form</title>
    <style>
        .errors {
            color: red;
        }
    </style>
</head>
<body>
    ISBN: ${book.isbn} <br>
    PUBLISHER: ${book.publisher} <br>
    TITLE: ${book.title} <br>
    TYPE: ${book.type} <br>
    AUTHOR: ${book.author.firstName} ${book.author.lastName}
</body>
</html>


