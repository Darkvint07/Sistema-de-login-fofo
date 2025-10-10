<?php
include 'conexao.php'; // Conecta ao banco

$usuario = $_POST['usuario'];
$senha = $_POST['senha'];

$sql = "SELECT * FROM usuarios WHERE usuario = '$usuario' AND senha = '$senha'";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    echo "Login realizado com sucesso!";
} else {
    echo "Usuário ou senha incorretos.";
}
$conn->close();
?>
