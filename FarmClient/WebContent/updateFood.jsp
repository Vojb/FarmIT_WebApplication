<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Farmit</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet"
		href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		<link rel="stylesheet" href="skeleton.css">
			<link rel="stylesheet" type="text/css" href="farmit.css" />
</head>
<body>

	<%@ page import="javax.servlet.http.*"%>
	<%@ page import="example.farm.model.*"%>



	<!-- Begin Wrapper -->
	<div id="wrapper">
		<!-- Begin Header -->
		<div id="header"></div>
		<!-- End Header -->
		<!-- Begin Navigation -->
		<div>
			<%@ include file="includedivision.jsp"%>
		</div>
		<!-- End Navigation -->
		<!-- Begin Faux Columns -->
		<div id="faux">

			<div id="leftcolumn"></div>

			<div id="content">

				<div class="container">	
<h3>Update Food</h3>
<%
Food a = (Food) request.getAttribute("food");
%>
<br />

<form action="/FarmClient/Farmlet" method="post">


<label>Id</label>
<br />
<% %>
<input type="number" id="foundIdFood" name="foundIdFood" maxlength="5" readonly value="<%=a.getIdFood()%>"><br /> <label>FoodName</label>
<br /> <input type="text" name="foundFoodName" maxlength="222" readonly value="<%=a.getNameFood().substring(0, 1).toUpperCase() + a.getNameFood().substring(1)%>"> <br />
<label>Amount</label>
<br /> 
<input type="text" name="foundFoodAmount"
maxlength="222" readonly value="<%=a.getAmount()%>"> <br />

<br />



<br>
<br>
<hr>
<h3>Buy more <%=a.getNameFood().substring(0, 1).toUpperCase() + a.getNameFood().substring(1)%></h3>
<input type="text" name="buyAmount" maxlength="222" > 
<button type="submit" value="buyFood">Buy</button> 
<input name="operation" value="buy" type="hidden">
</form>
<form action="/FarmClient/Farmlet" method="post">
<button type="submit" value="find ">Back</button> <input
name="operation" value="find" hidden>
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
<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>
<script src="/FarmClient/myscripts.js"></script>
</html>
