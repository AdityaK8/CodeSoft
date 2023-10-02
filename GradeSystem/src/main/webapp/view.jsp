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
<title>view</title>
<%@include file="Css/Css.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

<%@include file="Css/nav.jsp" %>
<c:if test="${not empty ss }">
<div class="alert alert-primary" role="alert">Data Inserted</div>
<c:remove var="ss"/>
</c:if>
<div class="card  p-5" >
<h3 class="text-center pb-5">All Student Details</h3>
<table class="table table-striped">
 <thead>
 
 
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">English</th>
      <th scope="col">Hindi</th>
      <th scope="col">Mathematics</th>
      <th scope="col">Science</th>
      <th scope="col">SocialStudy</th>
      <th scope="col">Sanskrit</th>
      <th scope="col">Total Marks</th>
      <th scope="col">Percentage</th>
      <th scope="col">Grade</th>
      
    </tr>
  </thead>

<%

Session s= ServiceProvider.Service().openSession(); 
Query q=s.createQuery("from student");
List<student> list= q.list();
for(student v :list){
	

%>

 
  

  <tbody>
    <tr>
      <td><%=v.getId()%></td>
      <td><%= v.getName()%></td>
      <td><%=v.getEnglish()%></td>
      <td><%=v.getHindi()%></td>
      <td><%=v.getMaths()%></td>
      <td><%=v.getScience()%></td>
      <td><%=v.getSocial()%></td>
      <td><%=v.getSanskrit()%></td>
      <td><%=v.getTotal()%></td>
      <td><%=v.getPer()%></td>
      <td><%=v.getGrade() %></td>
      <td><a href="edit.jsp?note-id<%= v.getId() %>" class="btn btn-sm btn-primary">Edit</a></td>
      <td><a href="Delete?note-id=<%= v.getId() %>" class="btn btn-sm btn-danger ms-0">delete</a></td>
    </tr>
   
 






<% 
}
s.close();


%>
 </tbody>
</table>
</div></div>

</body>
</html>