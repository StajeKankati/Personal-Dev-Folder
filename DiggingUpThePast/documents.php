<?php
//include auth.php file on all secure pages
include("auth.php");
?>

<!DOCTYPE html>
<html>
	<head>
		<title>Digging Up The Past - Documents</title>
		<style type="text/css">
			#main-header
			{
				font-family:Comic Sans MS;
				color:brown;
			}
			#copyright
			{
				font-family:Arial, serif;
				text-align:center;
				color:brown;
				font-size:12px;
				width:100%;
				float:bottom;
				padding-top:50%;
			}
			#info
			{
				background-color:gray;
				color:white;
				float:right;
				width:80%;
				padding: 0px 5px;
				box-sizing:border-box;
			}
			#sidebar
			{
				background-color:blue;
				color:white;
				float:left;
				width:20%;
				padding: 0px 5px;
				box-sizing:border-box;
				line-height:1.6em;
			}
			#teacher-sidebar
			{
				background-color:white;
				color:blue;
				float:left, top;
				width:20%;
				padding: 5px 5px;
				box-sizing:border-box;
				line-height:1.6em;
			}
			#search
			{
				a:link color:black;
				text-align:center;
			}
			a:link, a:visited
			{
				color:coral;
				text-decoration:none;
			}
			#keywords
			{
				background-color:gray;
				color:white;
				float:right;
				width:80%;
				padding: 0px 5px;
				box-sizing:border-box;
			}
			h2 a:visited
			{
				color:yellow;
			}
			h1 a:visited
			{
				color:inherit;
				text-decoration:none;
			}
		</style>
	</head>
	<body style="background-color:gray;">
		<header id="main-header">
			<h1><a href="DiggingUpThePast.php">Digging Up The Past</a></h1>
			<a href="logout.php" align="right">Logout</a>
			<hr>
		</header>
		<div id="sidebar">
			<p>
				 <ul style="list-style-type:none">
					<li>Class Name</li>
					<li><a href="search.php">Search</a></li>
					<li><a href="documents.php">Documents</a></li>
				</ul> 
			</p>
		</div>
		
		<div id="info">
		<ul style="list-style-type:none">
				<?php
				$dbh = new PDO("mysql:host=localhost;dbname=diggingupthepast", "root", "");
				$stat = $dbh->prepare("select * from filestore");
				$stat->execute();
				while($row = $stat->fetch()){
					echo "<li><a target='_blank' href='view.php?id=".$row['id']."'>".$row['name']."</a></li>";
				}
				?>
			</ul>
		</div>
		<div id="teacher-sidebar">
			<p>
				<ul style="list-style-type:none">
					<li><a href="upload.php">Upload</a></li>
					<li><a href="keyword.php">Keywords</a></li>
				</ul> 
			</p>
		</div>
		<footer id="copyright">Copyright &copy; 2018, Run for the Mills</footer>
	</body>
</html>

<!-- -->			