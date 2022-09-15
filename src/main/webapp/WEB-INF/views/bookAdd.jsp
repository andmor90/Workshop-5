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
<form:form method="post" action="" modelAttribute="book">
    ISBN: <form:input path="isbn"/><form:errors path="publisher" cssClass="errors"/><br>
    PUBLISHER: <form:input path="publisher"/><form:errors path="publisher" cssClass="errors"/><br>
    TITLE: <form:input path="title"/><form:errors path="title" cssClass="errors"/><br>
    TYPE: <form:input path="type"/><form:errors path="type" cssClass="errors"/><br>
    AUTHOR: <form:select path="author" items="${authors}" itemLabel="fullName" itemValue="id" multiple="false" /><form:errors path="author" cssClass="errors"/><br>

    <form:hidden path="id" />
    <%--  <form:errors path="*" />--%>
    <button type="submit">Save</button>
</form:form>
</body>
</html>


