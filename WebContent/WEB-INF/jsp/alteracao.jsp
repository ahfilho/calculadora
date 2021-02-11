<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, 
    br.com.dao.*,
    br.com.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@taglib tagdir="/WEB-INF/tags" prefix="teste"%>

<c:import url="/WEB-INF/jsp/cabecalho.jsp" />

<html>
<head>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.9.0/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.8.2.js"></script>
<script src="http://code.jquery.com/ui/1.9.0/jquery-ui.js"></script>

<meta charset="ISO-8859-1">
<title>SISTEMA.COM</title>

</head>
<body>

	<div class="cabecalho">
		<h2>ALTERAÇÃO DE CADASTRO</h2>
	</div>
	<hr>
	<!-- TAGLIB - INSTANDIANDO UMA POJO  --- aqui é criado o DAO-->
	<!--   REMOVE o dao para nao instanciar mais o view
 -
<jsp:useBean id="dao" class="br.com.dao.ContatoDao"/>
-->
	<jsp:useBean id="contato" class="br.com.model.Contato" />

	<!-- Variável dao / acessa o metodo list atraves da expression language -->

	<!-- EEM SEGUIDA EXECUTAR UM LOOP PARA CARA CONTATO DENTRO DA COLEÇÃO-->
	<c items="${contatos}">

	<form action="mvc?logica=Altera" method="post">
		Id: <input type="text" name="id" value="${testeEDITA.id}" /><br /> Nome:
		<input type="text" name="nome" value="${testeEDITA.nome}" /><br />
		E-mail: <input type="text" name="email" value="${testeEDITA.email}" /><br />
		Endereço: <input type="text" name="endereco" value="${testeEDITA.endereco}" /><br />

		<!--  COLOCA UM CALENDARIO NO INPUT  -----  TAGFILES -->
		Data Nascimento:
		<teste:campoData id="dataNascimento" />
		<br /> <input type="hidden" name="dataNascimento"
			value="${testeedt.dataNascimento }" /> <input type="submit"
			value="ALTERAR" />
	</form>
	</c>


	<!-- lista os contatos com um link chamando a lógica de remoção e passando o id do contato: -->
	</tr>
	<a href="mvc?logica=InicioLogica">INÍCIO</a>
	<br>
	<a href="mvc?logica=AdicionaContatoLogica">ADICIONAR CONTATO </a>
	<br>
	<br>

	<br>


	</table>
	<hr>
	<c:import url="/WEB-INF/jsp/rodape.jsp"></c:import>

</body>
</html>