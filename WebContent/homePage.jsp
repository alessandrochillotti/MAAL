        
<!DOCTYPE html>
<html>
<head>
<title>MAAL Assistant</title>
<style>
</style>
<meta charset="ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css">
<link href="css/w3school.css" rel="stylesheet" type="text/css">
</head>
<body style="background-color: #F6C640;">
	<ul>
		<li><a href="home.jsp">Home</a></li>
		<li><a href="">Calendar</a></li>
		<li><a href="AllQuestion.jsp">Forum</a></li>
		<li><a href="">Profile</a></li>
	</ul>

	<div>
		<ul class="menuBox">
			<li><a href=""> </a></li>
			<li><a href=""> Communication </a></li>
			<li><a href=""> Today lesson </a></li>
			<li><a href=""> Next lesson info </a></li>
			<li><a href=""> </a></li>
			<li><a href="index.jsp"> Logout </a></li>
		</ul>
	</div>

	<div
		style="border: solid; background-color: white; position: absolute; top: 20.5%; right: 5.2%; width: 66%; height: 58%">
		<form action="${pageContext.request.contextPath}/TimeToExitServlet" name="myform" method="POST">
			<input name="login" type="submit" id="login" value="Get started"
				class="btn btn-info" style="background-color: #272F54">
		</form>
	</div>


</body>
</html>