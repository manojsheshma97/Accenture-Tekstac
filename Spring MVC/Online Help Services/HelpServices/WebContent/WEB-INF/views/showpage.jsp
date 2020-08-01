<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lavender">
<center>
<form:form action="helpdesk" method="POST" modelAttribute="helper">
<h1>Welcome to Online Help Services</h1>
<table>
<tr><td>Choose Service:</td>
<td>
<form:select name="serviceType" id="serviceType" path="serviceType">
<form:options items="${serviceList}"/>
</form:select>
</td></tr>
<tr>
<td>Total Hours Service Required</td>
<td><form:input name="noOfHours" path="noOfHours"/></td>
</tr>
<tr>
<td><input type="submit" name="submit" value="TotalCost"/></td>
<td><input type="reset" name="reset" value="Cancel"/></td>
</tr>
</table>
</form:form>
</center>
</body>
</html>