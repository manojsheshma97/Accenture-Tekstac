<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
    <center><h2>Welcome to Online Help Services</h2>
    <sf:form method="POST" action="register" modelAttribute="register">
    <table>
        <tr>
        <td>UserName:</td>
        <td><sf:input id="userName" name="userName" path="userName" /></td>
        <td><sf:errors path="userName"/></td>
        </tr>
        <tr>
        <td>Contact Number</td>
        <td><sf:input id="contactNumber" name="contactNumber" path="contactNumber" /></td>
        <td><sf:errors path="contactNumber"/></td>
        </tr>
        <tr>
        <td>Email Id</td>
        <td><sf:input id="emailId" name="emailId" path="emailId" /></td>
        <td><sf:errors path="emailId"/></td>
        </tr>
        <tr>
        <td>Confirm Email Id</td>
        <td><sf:input id="confirmEmailId" name="confirmEmailId" path="confirmEmailId"/></td>
        <td><sf:errors path="confirmEmailId"/></td>
        </tr>
        <tr>
        <td><sf:checkbox id="status" name="status" path="status" value="true" /></td>
        <td>I agree</td>
        <td><sf:errors path="status"/></td>
        </tr>
        <tr>
        <td><input name="submit" type="submit" value="Register"/></td>
        <td><input name="reset" type="reset" value="Cancel"/></td>
        </tr>
    </table>
    </sf:form>
    </center>
</body>
</html>