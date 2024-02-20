<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Management</title>

</head>
<body>
	Hi <c:out value="${sessionScope.employeeInfo.first_name}"/><br>
	Address: <c:out value="${sessionScope.employeeInfo.address}"/><br>
	<hr>
</body>
</html>