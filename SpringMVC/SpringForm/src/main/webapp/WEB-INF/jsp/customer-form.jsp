<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<style>
.error{
       color: red
       }
</style>
</head>
<body>
<h3>Customer-Form</h3>
<form:form action="processform" modelAttribute="customer">

First Name:  <form:input path="firstName"/><br><br>

Last Name<sup>*</sup>:  <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
<!--<span id="lastName.errors" class="err">last name cannot be empty</span>-->
<br><br>
Free Passes<sup>*</sup>: <form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"/>
<br><br>
Postal Code<sup>*</sup>: <form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>
<br><br>
Course Code: <form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error"/>

<br><br>
<input type="submit" value="Submit">

</form:form>
