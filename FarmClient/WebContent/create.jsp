<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Farmit</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

  <link rel="stylesheet" href="skeleton.css">
<link rel="stylesheet" type="text/css" href="farmit.css" />
</head>
<body>

<%@ page import="javax.servlet.http.*" %>
<%@ page import="example.farm.model.*" %>



	<!-- Begin Wrapper -->
	<div id="wrapper">
		<a href="index.jsp"><img id="logga" src="signLoggoFarm.png"
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

			<div id="leftcolumn">
			<a href="create.jsp"><img src="horse.png"/> </a>
			<a href="create.jsp"><img src="hen.png" /> </a>
			</div>
			<div id="content">

				<div class="container">
							
							<h2>Add animal</h2>

							<form action="/FarmClient/Farmlet" method="post">

								<label>Type of Animal</label>
								<br />
								<select id="changeFood" class="form-control" name="changeFood" required>
									<option name="changeFood" data-content="Food" data-example=" ">Choose</option>
									<option name="changeFood" value="Cow" data-content="Powerfeed" data-example=" ">Cow</option>
									<option name="changeFood" value="Hen" data-content="Oats" data-example=" ">Hen</option>
									<option name="changeFood" value="Horse" data-content="Powerfeed" data-example="Hay">Horse</option>
									<option name="changeFood" value="Pig" data-content="Powerfeed" data-example="">Pig</option>
								</select>
								
								<label>Status</label>
								<select ="status-animal"class="form-control">
									<option>Healthy</option>
									<option>Sick</option>
									<option>Gluefactory</option>
								</select>
								<label>IdAnimal</label>
								<br />
								<input type="text" name="idAnimal" maxlength="5" required/>
								<br />
								<label>Name</label>
								<br />
								<input type="text" name="name" maxlength="222" required />
								<br />
								<label>Age</label>
								<br />
								<input type="text" name="age" maxlength="2" required />
								<br />
								<label>Box</label>
								<br />
								<input type="text" name="idBox" maxlength="2" required />
								<br />
								<label id="food">Food</label>
								<br />
								<input type="text" name="food" maxlength="2" required />
								<br />
								<label id="foodOne"> </label>
								<br />
								<input type="text" name="foodOne" maxlength="2" />
								<br />
								<br />
								<button type="reset" value="Reset">Reset</button>
								<button type="submit" value="addaAnimal">Add</button>
								<input name="operation" value="addAnimal" type="hidden">
								
							</form>
		


						</div>
					

			</div>
			<!-- End Content Column -->
			<!-- Begin Right Column -->
			<div id="rightcolumn">
			<a href="create.jsp"><img src="pig.png" /> </a>
			<a href="create.jsp"><img src="cow.png" /> </a>
			</div><!-- End Right Column -->
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