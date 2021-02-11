 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
    <c:import url="/WEB-INF/jsp/cabecalho.jsp"></c:import>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="css/main.css">

<meta charset="ISO-8859-1">
<title>PRIMEIRO JSP</title>
</head>

<body>
<div class="fundo" id="para1">


<h1>OLÁ, JSP</h1>

	MENU DE OPÇÕES  -- BOTOES PROVISÓRIOS PARA TESTE <br> <br>
	<br>
<button>	<a href="mvc?logica=AdicionaContatoLogica"> Adicionar novo </a>
</button>	
<button> <a href="mvc?logica=ListaContatosLogica${contato.id}">Listar todos</a>
</button>	
	<br><br>
	
	<% 
%>
</div>
    <c:import url="/WEB-INF/jsp/rodape.jsp"></c:import>

</body>
</html>