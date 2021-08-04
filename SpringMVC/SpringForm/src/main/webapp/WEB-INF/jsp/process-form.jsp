<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>
Confirmation Page
</title>
</head>
<body>
<h3>Hello ${student.firstName}</h3>
<h4> Last Name: ${student.lastName} </h4>
<h4>Country: ${student.country}</h4>
<h4>Preferred Language: ${student.favLang}</h4>
<h4>Operating Systems:</h4>
<ul>
<c:forEach var="temp" items="${student.OS}">

<li>${temp}</li>

</c:forEach>
</ul>
</body>
</html>


