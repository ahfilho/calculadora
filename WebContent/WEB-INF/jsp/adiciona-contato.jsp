<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@taglib tagdir="/WEB-INF/tags" prefix="teste" %>

<c:import url="/WEB-INF/jsp/cabecalho.jsp"/>

<link rel="stylesheet" href="http://code.jquery.com/ui/1.9.0/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.8.2.js"></script>
<script src="http://code.jquery.com/ui/1.9.0/jquery-ui.js"></script>
<html>
    <body>
      <h1>Adiciona Contatos</h1>
      <br>
            	<a href="mvc?logica=InicioLogica">Início</a>
      <br>
              <a href="mvc?logica=ListaContatosLogica${contato.id}">Listar todos</a>
              <br>
      			
      <hr />
   <form action="mvc?logica=Adiciona" method="post">
 
    Nome: <input type="text" name="nome" /><br />
    E-mail: <input type="text" name="email" /><br />
    Endereço: <input type="text" name="endereco" /><br />
    
    <!--  COLOCA UM CALENDARIO NO INPUT  -----  TAGFILES -->
    Data Nascimento: <teste:campoData id="dataNascimento" /><br />   

    <input type="submit" value="Gravar"/>
  </form>
      <c:import url="/WEB-INF/jsp/rodape.jsp"/>
      
    </body>
  </html>