<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Farmit</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script type="javascript" src="script.js"> </script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="farmit.css" />
</head>
<body>

<%@ page import="javax.servlet.http.*" %>
<%@ page import="example.farm.model.*" %>



	<!-- Begin Wrapper -->
	<div id="wrapper">
		<a href="index.jsp"><img id="logga" src="farmitLogga.jpg"
			height="120px" /> </a>
		<!-- Begin Header -->
		<div id="header">
		
		</div>
		<!-- End Header -->
		<!-- Begin Navigation -->
		<div id="navigation">
			<a href="index.jsp">Home</a> <a href="create.jsp">Add</a> <a
				href="find.jsp">Find</a> 
		</div>
		<!-- End Navigation -->
		<!-- Begin Faux Columns -->
		<div id="faux">

			<div id="leftcolumn"></div>

			<div id="content">

				<div class="container">
							
							<h3>Update animal</h3>
		<% Building a = (Building)request.getAttribute("building"); %>
									<br>

									<form action="/FarmClient/Farmlet" method="post">
									<label>Building</label>
								<br>
								<input type="text" name="foundTypeAnimal" maxlength="222" readonly value="<%= a.getIdBuilding()%>"> 
								<br>
								<label>Status</label>
								<select class="form-control">
									<option>Healthy</option>
									<option>Sick</option>
									<option>Gluefactory</option>
								</select>
								<br>
								
								<br>
								<button type="submit" value="find ">Back</button>
								<input name="operation" value="find" type="hidden">		
								
					

							</form>
					

						</div>
						

				
			</div>
			<!-- End Content Column -->
			<!-- Begin Right Column -->
			<div id="rightcolumn"></div>
			<!-- End Right Column -->
		</div>
		<!-- End Faux Columns -->
		<!-- Begin Footer -->
		<div id="footer">farm life</div>
		<!-- End Footer -->
	</div>
	<!-- End Wrapper -->
</body>
</html>