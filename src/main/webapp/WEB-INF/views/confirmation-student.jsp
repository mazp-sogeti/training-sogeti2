<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
   <!-- Bootstrap    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> -->
	<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>

<body>

 <table class="table table-striped">
                <tbody>
                  <tr>
                    <td>First Name Studen</td>
                    <td>${student.firstName}</td>
                  </tr>
                  <tr>
                    <td>Last Name Student</td>
                    <td>  ${student.lastName}</td>
                  </tr>

                   <tr>
                    <td>Country Student</td>
                    <td>${student.country} </td>
                  </tr>
               </tbody>
              </table>  
<b></b>

Student Name : ${param.studentName}
<b></b>
This is the new implementation ${message}
<b></b>
</body>
</html>
