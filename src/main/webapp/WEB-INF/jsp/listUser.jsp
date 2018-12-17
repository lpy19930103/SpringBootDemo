<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<<!doctype html>
<html lang="en">
<head>

    <title>ListUser</title>
</head>
<body>

<table align="center" border="1" cellpadding="0">
    <tr>
        <td>
            id
        </td>
        <td>
            name
        </td>
    </tr>

    <c:forEach items="${listUser}" var="u" varStatus="s">
        <tr>
            <td>
                    ${u.id}
            </td>
            <td>
                    ${u.username}
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>