<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Admin</title>
    <link rel="stylesheet" href="/resources/style.css">
</head>
<body>
<table align="center" border="2">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Address1</th>
        <th>Address2</th>
        <th>City</th>
        <th>State</th>
        <th>Zip</th>
        <th>Country</th>
        <th>Date</th>
    </tr>
    <c:forEach items="${adList}" var="admin">
        <tr>
            <td>${admin.FirstName}</td>
            <td>${admin.LastName}</td>
            <td>${admin.Address1}</td>
            <td>${admin.Address2}</td>
            <td>${admin.City}</td>
            <td>${admin.State}</td>
            <td>${admin.Zip}</td>
            <td>${admin.Country}</td>
            <td>${admin.Date}</td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
