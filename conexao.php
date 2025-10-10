<?php
$host = '127.0.0.1';
$user = 'root';
$pass = '606312'; 
$db = 'sistema_login';

$conn = new mysqli($host, $user, $pass, $db);

if ($conn->connect_error) {
    die('Erro: ' . $conn->connect_error);
}
?>
