<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<body>

<form:form action="processform" modelAttribute="student">

First Name:  <form:input path="firstName"/><br><br>

Last Name:  <form:input path="lastName"/><br><br>

Country:    <form:select path="country">
<form:options items="${student.countryOptions}"/>
<!--
<form:option value="None" label="Select.."/>
<form:option value="India" label="IND"/>
<form:option value="Brazil" label="BRS"/>
<form:option value="Argentina" label="ARG"/>
<form:option value="Germany" label="GER"/>
<form:option value="England" label="ENG"/>
<form:option value="America" label="USA"/>
-->

</form:select><br><br>
Languages:
C <form:radiobutton path="favLang" value="C"/>
Java <form:radiobutton path="favLang" value="Java"/>
Python <form:radiobutton path="favLang" value="Python"/>
C# <form:radiobutton path="favLang" value="C#"/><br><br>
Operating Systems:
Windows <form:checkbox path="OS" value="windows"/>
MacOS <form:checkbox path="OS" value="MacOS"/>
Linux <form:checkbox path="OS" value="Linux"/><br><br>

<input type="submit" value="Submit">

</form:form>

</body>

</html>