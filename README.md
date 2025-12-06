# Sistema de login fofo

Projeto de estudo que implementa um sistema de login e cadastro de usuários com interface web e também telas em Java, integrado a um banco de dados local. Após o login, o sistema exibe uma interface temática com gatinhos para tornar os testes mais divertidos.

> ⚠️ **Aviso de autoria:**  
> Este projeto foi desenvolvido **como exercício de aprendizagem**, **com forte apoio de tutoriais, exemplos da internet e auxílio de IA**, além de adaptações e integrações feitas por mim. O objetivo principal foi entender o funcionamento de um sistema de login com banco de dados e praticar a integração entre Java, PHP, HTML/CSS/JavaScript e MySQL, e **não** criar uma solução pronta ou profissional para produção. [web:131][web:134]

## Funcionalidades

- Cadastro de novos usuários no banco de dados local.
- Login com validação de usuário e senha.
- Telas de login e cadastro em Java (desktop).
- Formulários em HTML/CSS com interação em JavaScript.
- Testes de conexão com o banco e de inserção de dados.

## Tecnologias utilizadas

- **Frontend web:** HTML, CSS, JavaScript  
  Exemplos de arquivos: `form.html`, `form_login.html`, `index.html`, `gato.js`, `bitnami.css`.

- **Backend web:** PHP  
  Exemplos de arquivos: `conexao.php`, `conexao-exemplo.php`, `cadastro.php`, `login.php`, `inserir.php`, `teste.php`, `testinsert.php`, `testeconexao.php`.

- **Aplicação desktop:** Java  
  Exemplos de arquivos: `SistemaLogin.java`, `TelaLogin.java`, `TelaCadastro.java`, `TesteConexao.java` e os respectivos `.class`.

- **Banco de dados:** MySQL (banco local)  
  Conexão via `mysql-connector-j-9.4.0.jar`.

- **Outros:** `jakarta.mail-2.0.2.jar` (reservado para recursos de e-mail em testes futuros). [image:2][web:155]

## Estrutura do projeto (resumo)

- Arquivos **Java / .class**: lógica de login/cadastro e telas desktop.
- Arquivos **PHP**: conexão com MySQL, cadastro, login e scripts de teste.
- Arquivos **HTML/CSS/JS**: formulários e interface web.
- Arquivos **.jar**: bibliotecas usadas para conexão com banco e outros recursos.

## Como executar (ambiente local)

1. **Servidor PHP + páginas web**
   - Instale um servidor com PHP e MySQL (por exemplo, XAMPP). [web:136]  
   - Crie o banco de dados e a(s) tabela(s) de usuários conforme o script SQL que você utiliza (ex.: tabela `usuarios` com campos como `id`, `nome`, `email`, `senha`).  
   - Ajuste host, usuário, senha e nome do banco em `conexao.php` e demais arquivos PHP que acessam o banco.  
   - Copie os arquivos do projeto para a pasta do servidor (`htdocs` ou equivalente).  
   - Acesse pelo navegador, por exemplo: `http://localhost/Sistema-de-login-fofo/form_login.html`.

2. **Aplicação Java (desktop)**
   - Importe o projeto Java em uma IDE (NetBeans, Eclipse, IntelliJ, etc.). [web:133]  
   - Adicione o `mysql-connector-j-9.4.0.jar` ao classpath do projeto.  
   - Ajuste, nas classes de conexão, os mesmos dados do seu banco local.  
   - Execute as classes de tela, como `TelaLogin.java` ou `SistemaLogin.java`, para testar o login/cadastro via Java.

## Objetivos de aprendizado

- Praticar autenticação básica com backend e banco de dados.  
- Entender, na prática, como conectar aplicações (Java e PHP) a um banco MySQL local.  
- Explorar e **adaptar códigos prontos de tutoriais e IA**, aprendendo a ler, modificar e integrar diferentes partes de um sistema. [web:135][web:143]  
- Ganhar familiaridade com a organização de um projeto que mistura várias linguagens e camadas (frontend, backend e banco).

## Limitações e avisos

- Este sistema **não é seguro para uso em produção**: não implementa todas as boas práticas de segurança (hash de senha robusto, validação completa de entrada, prevenção de SQL Injection, etc.). [web:133][web:139]  
- O foco do projeto é **estudo e portfólio de estágio**, mostrando contato real com Java, PHP, HTML/CSS/JS e MySQL com apoio de materiais externos e IA.
