<?php
$host = '127.0.0.1';
$user = 'root';
$pass = '606312';
$db   = 'sistema_login';

$conn = new mysqli($host, $user, $pass, $db);

if ($conn->connect_error) {
    die('Erro de conexão: ' . $conn->connect_error);
} else {
    echo 'Conectado ao banco sistema_login!<br>';
    $result = $conn->query("SHOW TABLES");
    while ($row = $result->fetch_array()) {
        echo 'Tabela: ' . $row[0] . '<br>';
    }
}
$conn->close();
?>
