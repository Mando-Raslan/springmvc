<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentFormPage</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >

 <style type="text/css">
 
   .error {color:blue}
 
 </style>

</head>
<body>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" ></script>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<%@include file="navbar.jsp" %>

<br>

<div class="container">

<h1> Welcom To Student Registration </h1>
<hr>
  
  <form:form action="registerStudent" method="get" modelAttribute="studentform">
  <div class="form-row">
  
    <div class="form-group col-md-6">
      <label for="email">Email</label>
      <form:input path="email" class="form-control" />
      <form:errors path="email" cssClass="error"/>
    </div>
    
    <div class="form-group col-md-6">
      <label for="pass">Password</label>
      <form:input path="pass" class="form-control" />
      <form:errors path="pass" cssClass="error"/>
    </div>
    
  </div>
  
  <div class="form-group">
    <label for="address">Address</label>
    <form:input path="address" class="form-control"  placeholder="1234 Main St"/>
    <form:errors path="address" cssClass="error"/>
  </div>
  
  
  <div class="form-row">
  
    <div class="form-group col-md-6">
      <label for="city">City</label>
      <form:input path="city" class="form-control" />
      <form:errors path="city" cssClass="error"/>
    </div>
    
    <div class="form-group col-md-4">
      <label for="inputState">State</label>
      <form:select path="inputState" class="form-control">
         <form:options items="${studentform.options}"/>
      </form:select> 
    </div>
    
    <div class="form-group col-md-2">
      <label for="inputZip">Zip</label>
      <form:input path="inputZip" class="form-control" />
      <form:errors path="inputZip" cssClass="error"/>
    </div>    
  </div>
  
  
  
  
  <div class="form-check form-check-inline">
      <form:checkbox path="courses" value="Android" class="form-check-input" />
      <label class="form-check-label" for="courses">Android</label>
  </div>
  <div class="form-check form-check-inline">
     <form:checkbox class="form-check-input" path="courses" value="Ios"/>
     <label class="form-check-label" for="courses">IOS</label>
  </div>
  <div class="form-check form-check-inline">
     <form:checkbox class="form-check-input" path="courses" value="Windows"/>
     <label class="form-check-label" for="courses">Very Good (Spring)</label>
  </div>
  
  
  <br><br>
  
  
  <button type="submit" class="btn btn-primary">Register</button>
</form:form>


</div>


</body>
</html>