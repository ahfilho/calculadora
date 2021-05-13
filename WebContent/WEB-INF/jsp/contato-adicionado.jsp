 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h2 style="text-align:center">


		Contato ${param.usuario} adicionado com sucesso
		
		<br>
					<a href="mvc?logica=InicioLogica">Início</a>
		<br>
			<a href="mvc?logica=AdicionaContatoLogica">Inserir novo</a>
		
	<a href="mvc?logica=ListaContatosLogica${contato.id}">Listar todos</a></h2>
		
</body>
</html>