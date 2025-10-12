<?php
include 'conexao.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if (
        isset($_POST['nome'], $_POST['senha']) &&
        trim($_POST['nome']) !== '' &&
        trim($_POST['senha']) !== ''
    ) {
        $nome = trim($_POST['nome']);
        $senha = trim($_POST['senha']);

        $senhaCriptografada = password_hash($senha, PASSWORD_DEFAULT);

        $stmt = $conn->prepare("INSERT INTO usuarios (nome, senha) VALUES (?, ?)");
        if ($stmt) {
            $stmt->bind_param("ss", $nome, $senhaCriptografada);
            if ($stmt->execute()) {
                echo "Usuário inserido com segurança!";
            } else {
                echo "Erro ao inserir: " . $stmt->error;
            }
            $stmt->close();
        } else {
            echo "Erro na preparação: " . $conn->error;
        }
    } else {
        echo "Preencha os campos corretamente!";
    }
} else {
    echo "Acesso inválido!";
}
$conn->close();
?>

