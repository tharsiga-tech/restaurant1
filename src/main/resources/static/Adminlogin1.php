<?php
session_start();
include("Config1.php");
$username=$_POST['usernameh'];
$password=$_POST['passwordh'];

$match="select no from adminlogin where username='$username' and password='$password'; ";

$qry=mysql_query($match);
$num_rows=mysql_num_rows($qry);

if($num_rows<=0) {
	echo "Sorry, there is no username $username with the specified password.";
	echo "Try again";
	exit;
}
else {
	$_SESSION['user']=$_POST["usernameh"];
	header("location:adminpage.html"); //Session1.php
}
?>