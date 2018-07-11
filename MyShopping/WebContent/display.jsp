<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> HOME PAGE</title>
</head>
<body>

<h1>Online Shopping Page</h1>

<c:choose> 
<c:when test="${ilist.size()>0}">

<h2>Available Items Are</h2>
    
     <table border="1">
     <tr><td>id</td><td>name</td><td>price</td><td>category</td><td>quantity</td></tr>
     <c:forEach var="itm" items="${ilist}">
    <tr><td>${itm.id}</td>  <td>${itm.name}</td>  <td>${itm.price}</td>  <td>${itm.category}</td>  <td>${itm.quantity}</td>   </tr>
     </c:forEach>
     </table>
     </c:when>
   <c:otherwise>
   
   <h3>No Items were found </h3>
   </c:otherwise>
   </c:choose>
   
   <form:form action="placeOrder.obj" modelAttribute="sitem"> 
   Enter Item ID : <form:input path="id" type="text" value=""/><br>
   <input type="submit" value="Place Order"/> 
   </form:form>

</body>
</html>

