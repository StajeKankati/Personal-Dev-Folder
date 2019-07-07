<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Digging Up The Past - Login</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<style type="text/css">
			#main-header
			{
				font-family:Comic Sans MS;
				text-align:center;
				color:brown;
				padding-top:200px;
			}
			#loginStuff
			{
				padding-top:10px;
				font-family:Times;
				text-align:center;
				color:black;
				font-size:18px;
				line-height:1.4em;
			}
			#copyright
			{
				font-family:Arial, serif;
				text-align:center;
				color:brown;
				font-size:12px;
			}
		</style>
	</head>
	<body style="background-color:gray;">
	<?php
		require('db.php');
		session_start();

		if (isset($_POST['username'])){
  
			$username = stripslashes($_REQUEST['username']);

			$username = mysqli_real_escape_string($con,$username);
			$password = stripslashes($_REQUEST['password']);
			$password = mysqli_real_escape_string($con,$password);

			$query = "SELECT * FROM account WHERE username='$username'and password='".md5($password)."'";
	$result = mysqli_query($con,$query) or die(mysql_error());
	$rows = mysqli_num_rows($result);
        if($rows==1){
	    $_SESSION['username'] = $username;
            // Redirect user to index.php
	    header("Location: DiggingUpThePast.php");
         }else{
	echo "<div class='form'>
<h3>Username/password is incorrect.</h3>
<br/>Click here to <a href='login.php'>Login</a></div>";
	}
    }else{
?>
		<header id="main-header">
			<h1>Digging Up The Past</h1>
			<h3>The Subject-Specific Search Engine</h3>
		<header>
		<section id="loginStuff">
			<form action="" method="POST">
				<div>
						<label>Username</label>
						<input type="text" name="username">
				</div>
				<div>
						<label>Password  </label>
						<input type="password" name="password">
				</div>
				<p><a href="create.php">Create a new account</p>
				<br>
				<input type="submit" name="submit" value="Login">
			</form>
			<div style="margin-top:450px"></div>			
			<footer id="copyright">Copyright &copy; 2018, Run for the Mills</footer>
		</section>
	<?php } ?>
	</body>
</html>