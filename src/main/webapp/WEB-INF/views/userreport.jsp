<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Admin</title>

    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even){background-color: #f2f2f2}

        th {
            background-color: lightblue;
            color: white;
        }
    </style>
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
            <td>${admin.firstName}</td>
            <td>${admin.lastName}</td>
            <td>${admin.address1}</td>
            <td>${admin.address2}</td>
            <td>${admin.city}</td>
            <td>${admin.state}</td>
            <td>${admin.zip}</td>
            <td>${admin.country}</td>
            <td>${admin.date}</td>

        </tr>

    </c:forEach>
</table>
</body>
</html>

