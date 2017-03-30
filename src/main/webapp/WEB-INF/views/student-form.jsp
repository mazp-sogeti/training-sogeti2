<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
   <!-- Bootstrap    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> -->
	<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>

	<form:form action="proccesFormVersionFour" modelAttribute="student">
	<div class="form-group">
	First name: <form:input class="form-control" path="firstName"/>
	</div>
	
		<div class="form-group">
	Last name: <form:input class="form-control" path="lastName"/>
	
		</div>
	<div class="form-group">
	<form:select class="form-control" path="country">
	<form:options class="form-control" items="${student.countryOptions}"/>
	 </form:select>
	 
	 </div>
	<br></br>
	<input type="submit" value="Submit"/>
	 </form:form>

</body>
</html>