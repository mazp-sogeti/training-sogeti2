<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<!-- Bootstrap    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> -->
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>

	<form:form action="proccesFormVersionFour" modelAttribute="student">
		<div class="form-group">
			First name:
			<form:input class="form-control" path="firstName" />
		</div>

		<div class="form-group">
			Last name:
			<form:input class="form-control" path="lastName" />
		</div>

		<form:select class="form-control" path="country">
			<form:options class="form-control" items="${student.countryOptions}" />
		</form:select>


		<div class="form-group">
			C++ <form:radiobutton path="favoriteLenguage" value="C++" />
			Java <form:radiobutton path="favoriteLenguage" value="Java" />
			PHP <form:radiobutton path="favoriteLenguage" value="PHP" />
		</div>
		
			<div class="form-group">
			Windows <form:checkbox path="operatingSystem" value="Windows" />
			iOS <form:checkbox path="operatingSystem" value="IOS" />
			Linux <form:checkbox path="operatingSystem" value="Linux" />
		</div>
		
		
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>