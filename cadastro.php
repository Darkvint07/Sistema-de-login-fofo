<?php
include 'conexao.php'; // conecta ao banco
$usuario = $_POST['usuario'];
$senha = $_POST['senha'];
$sql = "INSERT INTO usuarios (usuario, senha) VALUES ('$usuario', '$senha')";
if ($conn->query($sql) === TRUE) {
    echo "Cadastro feito com sucesso!";
} else {
    echo "Erro: " . $conn->error;
}
$conn->close();
?>
