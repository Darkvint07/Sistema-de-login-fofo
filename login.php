<?php
include 'conexao.php';

if(isset($_POST['usuario']) && isset($_POST['senha'])){
    $usuario = $_POST['usuario'];
    $senha = $_POST['senha'];

    $sql = $conn->prepare("SELECT senha FROM usuarios WHERE usuario=?");
    $sql->bind_param("s", $usuario);
    $sql->execute();
    $result = $sql->get_result();
    
    if($row = $result->fetch_assoc()){
        if(password_verify($senha, $row['senha'])){
            echo "Login realizado com sucesso!";
        } else {
            echo "Senha incorreta!";
        }
    } else {
        echo "Usuário não encontrado!";
    }
    $sql->close();
    $conn->close();
}
?>

