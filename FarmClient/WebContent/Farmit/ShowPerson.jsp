<%@ page contentType="text/html;charset=ISO-8859-1"%>
<%@ page import = "bajs.Person" %>
<!DOCTYPE html>
<html lang="en">
<head>
 <meta charset="ISO-8859-1">
 <title>Show person</title>
</head>
<body>
<h2>Person:</h2>
<p>
 <% Person p = (Person)request.getAttribute("person"); %>
 <input type="text" name="txtName" value="<%= p.getName()%>"></p>
<p><input type="text" name="txtAddress" value="<%=p.getAddress()%>"></p>
<p><%= new java.util.Date() %></p>
<form action="/FarmClient/MainServlet" method="post">
 <input type="submit" name="submit" value="Tillbaka">
 <input name="operation" value="searchperson" type="hidden">
</form>
</body>
</html>