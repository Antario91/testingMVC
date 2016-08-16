<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Testing form</title>
</head>
<body>
<p>${hello}</p>
<form:form modelAttribute="user" action="/result" method="GET">
    <table>
        <tr>
            <td>First name:</td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td>Last name:</td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="GoTo result"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>