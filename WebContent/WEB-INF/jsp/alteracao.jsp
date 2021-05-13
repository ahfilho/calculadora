<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,  br.com.dao.*, br.com.model.*"%>
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
<link rel="stylesheet">
<meta charset="ISO-8859-1">
<title>SISTEMA.COM</title>

</head>
<body>

	<div class="cabecalho">
		<h2 style="text-align: center">ALTERAÇÃO DE CADASTRO</h2>
	</div>
	<hr>
	<!-- TAGLIB - INSTANDIANDO UMA POJO  --- aqui é criado o DAO-->

	<!-- EEM SEGUIDA EXECUTAR UM LOOP PARA CARA CONTATO DENTRO DA COLEÇÃO-->
	<jsp:useBean id="contato" class="br.com.model.Contato" />

	<form action="mvc?logica=Altera" method="post">
		<h4 style="text-align: center">
			<td>Id: ${contato.id}</td>

			<td>Usuario: <input type="text" name="nome"
				value="${contato.usuario}" /><br />
			</td>
			<td>E-mail: <input type="text" name="email"
				value="${contato.email}" /><br />
			</td>
			<td>Telefone: <input type="text" name="telefone"
				value="${contato.telefone}" /><br /> <!--  COLOCA UM CALENDARIO NO INPUT  -----  TAGFILES -->
				Data Nascimento: <teste:campoData id="dataNascimento" /> <br /> <input
				type="hidden" name="dataNascimento"
				value="${contato.dataNascimento }" /> <input type="submit"
				value="ALTERAR" />
		</h4>
	</form>



	<!-- lista os contatos com um link chamando a lógica de remoção e passando o id do contato: -->
	<h5 style="text-align: center">
		<a href="mvc?logica=InicioLogica">INÍCIO</a> <br> <a
			href="mvc?logica=AdicionaContatoLogica">ADICIONAR CONTATO </a>
	</h5>
	<br>

	<h4 style="text-align: center">
		<a href="mvc?logica=ListaContatosLogica${contato.id}">Listar todos</a>
	</h4>
	<br>
	<br>
	<hr>
	<c:import url="/WEB-INF/jsp/rodape.jsp"></c:import>

</body>
</html>