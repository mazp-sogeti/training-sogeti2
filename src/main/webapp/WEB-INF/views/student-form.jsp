<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<DOCTYPE html>
<html>
<body>
	
	<form:form action="proccesFormVersionFour" modelAttribute="student">
	
	First name: <form:input path="firstName"/>
	<br></br>
	Last name: <form:input path="lastName"/>
	<br></br>
	
	<form:select path="country">
	<form:options items="${student.countryOptions}"/>
	 </form:select>
	<br></br>
	<input type="submit" value="Submit"/>
	
	 </form:form>

</body>
</html>