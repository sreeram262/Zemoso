<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>
Customer Confirmation
</title>
</head>
<body>

The customer confirmed is ${customer.firstName} ${customer.lastName}
<br>
Free passes: ${customer.freePasses}<br>
Postal Code: ${customer.postalCode}<br>
Course Code: ${customer.courseCode}
</body>

</html>