<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css">
<title>MAAL assistant</title>
</head>

<body>
<body style="background-color:#F6C640 ">
	<h1>Welcome MAAL Assistant</h1>
	<form action="${pageContext.request.contextPath}/LoginServlet" name="myform" method="POST">

		<div style="background-color:#A22531;border: solid; position: absolute; left: 60%; width: 20%;  text-align: center;">
		<br>	
			<label for="username">Insert username</label> <br> <input id="username" name="username" type="text"> 
			<br> 
			<br>
			<label for="password">Insert password</label>
			<br> <input id="password" name="password" type="password">
			<br>
			<br> <input name="login" type="submit" id="login" value="Sign in" class="btn btn-info" style="background-color:#272F54">
			<br>
				 <input name="tipoLogin" type="hidden" value="user" id="tipoLogin" class="btn btn-warning">
			<br>
		</div>

	</form>
</body>


</html>