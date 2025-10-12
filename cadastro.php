<?php
include 'conexao.php';

if(isset($_POST['usuario']) && isset($_POST['senha'])){
    $usuario = $_POST['usuario'];
    $senha = password_hash($_POST['senha'], PASSWORD_DEFAULT);
    
    $sql = $conn->prepare("INSERT INTO usuarios (usuario, senha) VALUES (?, ?)");
    $sql->bind_param("ss", $usuario, $senha);
    
    if($sql->execute()){
        echo "Cadastro realizado com sucesso!";
    } else {
        echo "Erro: " . $conn->error;
    }
    $sql->close();
    $conn->close();
}
?>

