<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Farmit</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="farmit.css" />
<link rel="stylesheet" href="skeleton.css">
</head>
<body>

<%@ page import="javax.servlet.http.*" %>
<%@ page import="example.farm.model.*" %>



	<!-- Begin Wrapper -->
	<div id="wrapper">
		<a href="index.jsp"><img id="logga" src="signLogoFarm.png"
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

			<%@ include file="includeleft.jsp" %> 

			<div id="content">

				<div class="container">
							
							<h3>Update Box</h3>
		<% Box a = (Box)request.getAttribute("box"); %>
									<br>

									<form action="/FarmClient/Farmlet" method="post">
									<label>Box</label>
									<br>
									<input type="text" name="foundIdBox" maxlength="222" readonly value="<%= a.getIdBox()%>"> 
									<br>
									<label>Belongs to building</label>
									<br>
									<input type="text" name="foundIdBoxBuilding" maxlength="222" readonly value="<%= a.getBuilding().getIdBuilding()%>">
									<br>
								<%  %>
								<br>
								
								<br>
								<button type="submit" value="find ">Back</button>
								<input name="operation" value="find" type="hidden">		
								
					

							</form>
					

						</div>
						

				
			</div>

			<!-- End Content Column -->

			<!-- Begin Right Column -->

			<%@ include file="includeright.jsp" %> 

			<!-- End Right Column -->

		

		<!-- End Faux Columns -->

		<!-- Begin Footer -->

		<%@ include file="includefooter.jsp" %> 

		<!-- End Footer -->

</div>
	<!-- End Wrapper -->
</body>
<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<script src="/FarmClient/myscripts.js"></script>
</html>
