package br.com.mvc.logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.conectaBanco.ConnectionFactory;
import br.com.dao.ContatoDao;
import br.com.model.Contato;
import sun.util.calendar.LocalGregorianCalendar.Date;

public class Altera implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		Connection con = new ConnectionFactory().getConnection();
		System.out.println("AQUI TBM PASSOU");

		// interface PreparedStatement para pesquisar no banco e montar o comando SQL
		PreparedStatement stmt = con.prepareStatement("select contatos where id=?");

		req.getParameter("id");
		
		ContatoDao dao = new ContatoDao();

		long id = Long.parseLong(req.getParameter("id"));

		Contato contato = dao.pesquisaBanco(id);

	
		
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String endereco = req.getParameter("endereco");

		System.out.println(id);
		System.out.println(nome);
		System.out.println(email);
		System.out.println(endereco);

		req.setAttribute("teste", contato);

		
		System.out.println(id + "" + nome);

		System.out.println("TENTANDO JOGAR PARA A CLASSE ALTERAR");

		dao.altera(contato);

		stmt.executeUpdate();
		stmt.close();
		con.close();

		return "/WEB-INF/jsp/contato-adicionado.jsp";

	}

}
