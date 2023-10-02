<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
     <%@ page import="org.hibernate.*" %>
    <%@ page import="com.Service.ServiceProvider" %>
    <%@ page import="java.util.*" %>
    <%@ page import="com.entity.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
<%@include file="Css/Css.jsp" %>


<%int i = Integer.parseInt(request.getParameter("note-id").trim()); 
Session s = ServiceProvider.Service().openSession();
student se= s.get(student.class,i);


%>



</head>
<body>
<%@include file="Css/nav.jsp" %>




<div class="card align-self-center mr-6" style="width:auto">
<div class="card align-self-center mr-30" style="width:40rem">
<input value="<%=se.getId() %>" name="note" type="hidden"/>

<h3 class="align-self-center m-3">Edit Section</h3>
<form method="post" action="edit" class="pd-5">
  <div class="form-group row align-self-center mr-8">
    <label for="staticEmail" class="col-sm-10 col-form-label">Name</label>
    <div class="col-sm-10">
      <input type="Text" value=<%= se.getName()%> required class="form-control" name="name" id="inputPassword" placeholder="Full Name">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-10 col-form-label ">English</label>
    <div class="col-sm-10">
      <input type="number" value=<%= se.getEnglish()%> required class="form-control" name="english" id="inputPassword" placeholder="English Marks">
    </div>
    
    <label for="inputPassword" class="col-sm-10 col-form-label">Hindi</label>
    <div class="col-sm-10">
      <input type="number" value=<%= se.getHindi()%>  required class="form-control" name="hindi" id="inputPassword" placeholder="Hindi Marks">
    </div>
    
    <label for="inputPassword" class="col-sm-10 col-form-label">Mathematics</label>
    <div class="col-sm-10">
      <input type="number" value=<%= se.getMaths()%>  required class="form-control" name="math" id="inputPassword" placeholder="Mathematics Marks">
    </div>
    
    <label for="inputPassword" class="col-sm-10 col-form-label">Social Study</label>
    <div class="col-sm-10">
      <input type="number" value=<%= se.getSocial()%>  required class="form-control" name="social" id="inputPassword" placeholder="Social Marks">
    </div>
    
    <label for="inputPassword" class="col-sm-10 col-form-label">Science</label>
    <div class="col-sm-10">
      <input type="number" value=<%= se.getScience()%>  required class="form-control" name="science" id="inputPassword" placeholder="Science Marks">
    </div>
    
    <label for="inputPassword" class="col-sm-10 col-form-label">Sanskrit</label>
    <div class="col-sm-10">
      <input type="number" value=<%= se.getSanskrit()%>  required class="form-control" name="sanskrit" id="inputPassword" placeholder="Sanskrit Marks">
    </div>
    <button type="submit" class="btn btn-danger mr-40 align-self-center m-6">Update Detail</button>
  </div>
</form></div></div>


<%s.close(); %>

</body>
</html>