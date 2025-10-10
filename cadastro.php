<?php
include 'conexao.php';

$usuario = $_POST['usuario'];
$senha = $_POST['senha'];

if(empty($usuario) || empty($senha)) {
    echo "Preencha todos os campos!";
    exit;
}

$sql = "INSERT INTO usuarios (usuario, senha) VALUES ('$usuario','$senha')";
if ($conn->query($sql) === TRUE) {
    echo "Cadastro feito com sucesso!";
} else {
    echo "Erro: " . $conn->error;
}
$conn->close();
?>

