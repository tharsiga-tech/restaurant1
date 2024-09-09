<?php
session_start();
session_destroy();
header("Location: Adminlogin1.php");
exit();
?>
