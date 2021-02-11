	package br.com.servlet;

	import java.io.IOException;
	import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletConfig;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import org.apache.coyote.ProtocolException;

	import java.util.Date;

	import br.com.dao.ContatoDao;
	import br.com.model.Contato;
	import java.util.Calendar;

	@WebServlet("/removeContato")
	public class RemoveContatoServlet extends HttpServlet {
		
		//toda servlet deve ter um construtor sem argumentos para que o container possa criá-lo. Depois da criação, o servlet
		// container inicaliza a servlet com o método INIT e o usa enquanto estiver ativo.
		//Quando fica inativo é chamado o metodo destroy, para entao liberar o objeto.
		public void init(ServletConfig config) throws ServletException{
			super.init(config);
			log("iniciando a servlet");
		}
		
		public void destroy(){
			super.destroy();
			log("destruindo a servlet");
		}
		
	    protected void service(HttpServletRequest request,
	            HttpServletResponse response)
	            throws IOException, ServletException {
	        // busca o writer
	       // PrintWriter out = response.getWriter();

	        
	      
	        // buscando os parâmetros no request
	    	//casting para transformar STRING EM INTEIRO
	    	int teste = Integer.parseInt(request.getParameter("id"));
	    	
	    	
	        	ContatoDao dao = new ContatoDao();
	  	        Contato contato = new Contato();
	  	    
	  	       try {
	  	    	   if(teste == contato.getId()) {
	  	    	   dao.remover(contato);
	  	    	   }
	  	       } catch (Exception e) {
	  	    	   System.out.println("ERRO AO PASSAR O ID ");
	  	       }
	        
	    
	        RequestDispatcher rd = request
	                .getRequestDispatcher("lista-contatos.jsp");
	        rd.forward(request,response);
	    }
	}
	
	
