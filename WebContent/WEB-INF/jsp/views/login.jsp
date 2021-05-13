<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<h2>LOGIN DE USUARIOS</h2>
 <form action="mvc?logica=Adiciona" method="post">
 
    Usuário: <input type="text" name="usuario" /><br />
    
    Senha: <input type="text" name="senha" /><br />
    

    <input type="submit" value="Gravar"/>
  </form>
      <c:import url="/WEB-INF/jsp/rodape.jsp"/>
</body>
</html>