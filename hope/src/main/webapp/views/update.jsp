<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update Student Details Here</h1>
<h2>${msg}</h2>
<form:form action="update" method="post" modelAttribute="student">
<form:label path="id">ID</form:label>
		<form:input path="id" /><br>
		<form:label path="name">NAME</form:label>
		<form:input path="name" />
		<form:label path="course">COURSE</form:label>
		<form:input path="course" /><br>
	<input type="submit" name="save" value="UPDATE" />
	<input type="reset" name="reset" value="CLEAR">
</form:form> 

</body>
</html>