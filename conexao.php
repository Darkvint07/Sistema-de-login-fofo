<?php
$servername = "sql102.infinityfree.com";
$username = "if0_40150204";
$password = "2879882026Bb"; 
$dbname = "if0_40150204_darkvint"; 

$conn = new mysqli($servername, $username, $password, $dbname, 3306);
if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}
?>

