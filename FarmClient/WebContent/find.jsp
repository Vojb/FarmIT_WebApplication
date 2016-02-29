<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Farmit</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
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
		  <div>
  			<%@ include file="includedivision.jsp" %> 
      	</div>
		<!-- End Navigation -->
		<!-- Begin Faux Columns -->
		<div id="faux">

			<div id="leftcolumn"></div>

			<div id="content">

				<div class="container">
							<h3><center>What do you want to find?</center></h3>
							<hr>
							<h3>Animal</h3>

							<form action="/FarmClient/Farmlet" method="post" >
									<label>Find by Animal id</label>
									<br>
									<input type="numbers" id="findIdAnimal" name="findIdAnimal" maxlength="50" required>
									<button type="submit" id="findAnimal" value="btn_findByIdAnimal">Find </button>
									 <input type="text" id="Baajs" maxlength="222" hidden value="Gluefactory">
									<input name="operation" value="findByIdAnimal" type="hidden">
									<br>
									<%= request.getAttribute("msg") %>
								
							</form>
							<hr>
							<h3>Food</h3>
							<form action="/FarmClient/Farmlet" method="post">
									<label>Find by Food name</label>
									<br>
									<input type="text" name="findByFoodName" maxlength="52" required>
									<button type="submit" value="btn_findByFoodName">Find</button>
									<input name="operation" value="findByFoodName" type="hidden">
							</form>
							<hr>
							<h3>Building</h3>
							<form action="/FarmClient/Farmlet" method="post">
									<label>Find by Building Id</label>
									<br>
									<input type="text" name="findIdBuilding" maxlength="5" required>
									<button type="submit" value="btn_findIdBuilding">Find</button>
									<input name="operation" value="findByIdBuilding" type="hidden">

							</form>
							<hr>
							<h3>Boxes</h3>
							<form action="/FarmClient/Farmlet" method="post">
									<label>Find by Box Id</label>
									<br>
									<input type="text" name="findIdBox" maxlength="5" required>
									<button type="submit" value="btn_findIdbox">Find</button>
									<input name="operation" value="findByIdBox" type="hidden">
							</form>
							<hr>

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
<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<script src="/FarmClient/myscripts.js"></script>
</html>