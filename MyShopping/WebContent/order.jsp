<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Item</title>
<script>
function  check() {
	alert("checking ");
	
	
}
</script>
</head>
<body>
	

	<c:choose>
		<c:when test="${citem!=null}">
  CARD : ${citem}
  <h1>Purchase order form</h1>
  <form:form action="buyItem.obj" modelAttribute="citem" onsubmit="return check()">
  <table>
  <tr><td>Card No</td><td> <form:input path="cardNo" type="text" value=""/></td></tr>
  <tr><td>Name</td><td> <form:input path="name" type="text" value=""/></td></tr>
  <tr><td>Expiration date</td><td> <form:input path="expiry" type="date" value=""/></td></tr>
  <tr><td>CVV</td><td> <form:input path="cvv" type="text" value=""/></td></tr>
  <tr><td>Item Id</td><td> <form:input path="itemId" type="text" value=""/></td></tr>
  <tr><td>Mobile</td><td> <form:input path="mob" type="text" value=""/></td></tr>
  <tr><td>Quantity</td><td> <form:input path="quantity" type="text" value=""/></td></tr>
   <tr><td>MAX Quantity</td><td> <form:input path="maxQuantity" type="text" value="" disabled="disabled"/></td></tr>
  <tr><td><input type="submit" value="Buy Item"></td></tr>
  </table>
  
   </form:form>
  </c:when>
		<c:otherwise>

			<h3>card not found</h3>
		</c:otherwise>
	</c:choose>

</body>
</html>