<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>New User Sign up here...</h2>
	<hr/>
	
	<spring:form action="${pageContext.request.contextPath}/signup-save" method="POST" modelAttribute="userDetails">
		<br/>
		<br/>
		<spring:label path="userName">Enter user name</spring:label>
		<spring:input path="userName"/>
		<br/>
		<br/>
		<spring:label path="password">Enter password</spring:label>
		<spring:password  path="password"/>
		<br/>
		<br/>
		<spring:label path="confirmPassword">Confirm Password</spring:label>
		<spring:password path="confirmPassword"/>
		<br/>
		<br/>
		<spring:label path="PAN">Enter PAN ID</spring:label>
        <spring:input path="PAN"/>
        <br/>
        <br/>
        <spring:label path="DOB">Date of Birth</spring:label>
        <spring:input path="DOB"/>
        <br/>
        <br/>
        <spring:label path="currencyPref">Enter Currency Preference</spring:label>
        <spring:input path="currencyPref"/>
        <br/>
        <br/>
		<spring:label path="emailId">Enter emailId</spring:label>
		<spring:input path="emailId"/>
		<br/>
		<br/>
		<spring:label path="contact">Enter Contact number</spring:label>
		<spring:input path="contact"/>
		<br/>
		<br/>
		<spring:label path="roles">Select Role</spring:label>
		<ul>
			<li> <spring:checkbox path="roles" value="USER" label="USER"/></li>
			<li> <spring:checkbox path="roles" value="BACKOFFICEREP" label="BACKOFFICEREP"/></li>
		</ul>
		<br/>
		<br/>
		<input type="submit" value="SignUp">

	</spring:form>
	
</body>
</html>