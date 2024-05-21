<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Select Employee</title>
</head>
 <style>
        body {
            background-color: orange;
           
        }
    </style>

<body align=center >
    <form action="getEmployee" method="post">
        <label for="code">Select Employee Code:</label>
        <select name="code" id="code">
            <c:forEach items="${employees}" var="employee">
                <option value="${employee.code}">${employee.code}</option>
            </c:forEach>
        </select>
        <input type="submit" value="Get Details"/>
    </form>
</body>
</html>
