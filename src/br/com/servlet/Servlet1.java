package br.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet("/web1")  
	//Na nova especificação Servlets 3.0, que faz parte do Java EE 6,
	//podemos configurar a maneira como vamos acessar
	//a nossa Servlet de maneira programática, utilizando anotações simples.

	//De modo geral, não é mais preciso configurar as nossas Servlets no web.xml,
	//sendo suficiente usar a anotação @WebServlet apenas:

	public class Servlet1 extends HttpServlet {
	//estender de httpservlet
	
	  @Override
	  
	  protected void service(HttpServletRequest request,
	          HttpServletResponse response)
	          throws ServletException, IOException {
		  
		  
		  //  1 ---Escreva dentro do método service sua implementação
		  PrintWriter out = response.getWriter();
		  
		  out.println("<html>");
		  out.println("<head>");
		  out.println("<title>Primeira Servlet</title>");
		  out.println("</head>");
		  out.println("<pdy>");
		  out.println("<h1>TESTANDO O SERVLET PARA PROJETO WEB</h1>");
		  out.println("</body>");
		  out.println("</html>");

		  //	 2 --- abrir o arquivos XML e mapear a URL
		  
		  //PAREI EM     ----- FACILIDADE DAS SERVLETS 3.0
	  }
}
