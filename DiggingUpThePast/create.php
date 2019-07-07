<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title> Digging Up The Past - Create an account</title>
<link rel="stylesheet" type="text.css" href="style.css">
</head>
<body>
	<?php
		require('db.php');

		if (isset($_REQUEST['username'])){
        
			$username = stripslashes($_REQUEST['username']);
			$username = mysqli_real_escape_string($con,$username); 
			$password = stripslashes($_REQUEST['password']);
			$password = mysqli_real_escape_string($con,$password);
			$firstname = stripslashes($_REQUEST['firstname']);
			$firstname = mysqli_real_escape_string($con,$firstname);
			$lastname = stripslashes($_REQUEST['lastname']);
			$lastname = mysqli_real_escape_string($con,$lastname);
			$id = stripslashes($_REQUEST['id']);
			$id = mysqli_real_escape_string($con,$id);
			$isTeacher = stripslashes($_REQUEST['isTeacher']);
			$isTeacher = mysqli_real_escape_string($con,$isTeacher);
			
			$query = "INSERT into account values " . "('$username', '".md5($password)."', '$firstname', '$lastname', '$id', '$isTeacher')";
			$result = mysqli_query($con,$query);
			if($result){
			
			echo'	<div class="form">
					<h3>You are registered successfully.</h3>
					<p>Click here to <a href="login.php">Login</a><p>
					</div>';
			
			}
		}else{
?>
	<div id=fillout>
		<h3> Please fill out the following information and hit Submit</h3>
		<form name="registration" action="" method="post">
		<input type="text" name="username" placeholder="Username" required /> <br>
		<input type="password" name="password" placeholder="Password" required /> <br>
		<input type="text" name="firstname" placeholder="First Name" required /> <br>
		<input type="text" name="lastname" placeholder="Last Name" required /> <br>
		<input type="int" name="id" placeholder="ID" required /> <br>
		<input type="radio" name="isTeacher" value="T" /> Teacher <br> 
		<input type="radio" name="isTeacher" value="F" /> Student <br>
		<input type="submit" value="Register" name="submit" />
		</form>
	</div>
	<?php } ?>
</body>

</html>