<?php
$host = '127.0.0.1';
$user = 'root';
$pass = '';
$db   = 'sistema_login';

$conn = new mysqli($host, $user, $pass, $db);
if ($conn->connect_error) {
    die('Erro: ' . $conn->connect_error);
}

// Teste de escrita direta
$sql = "INSERT INTO usuarios (nome, idade) VALUES ('Teste', 99)";
if ($conn->query($sql) === TRUE) {
    echo "Deu certo!";
} else {
    echo "Erro: " . $conn->error;
}
$conn->close();
?>
