<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<h2>Hello World!-ichigo kurosaki</h2>

	<form:form action="${pageContext.request.contextPath}/logout" method="POST">

    		<input type="submit" value="Logout" />

    	</form:form>

</body>
</html>
