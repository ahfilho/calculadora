package br.com.mvc.logica;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.conectaBanco.ConnectionFactory;
import br.com.dao.ContatoDao;
import br.com.model.Contato;

public class AlteraContatoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("passou aqui 1");

		Connection con = new ConnectionFactory().getConnection();
		System.out.println("chegou aqui 2");

		// interface PreparedStatement para pesquisar no banco e montar o comando SQL
		PreparedStatement stmt = con.prepareStatement("select * from contatos");

		// executa um select
		ResultSet rs = stmt.executeQuery();

		// itera no ResultSet
		if (rs.next()) {

			long id = rs.getLong("id");
			String nome = rs.getString("nome");
			String email = rs.getString("email");
			String endereco = rs.getString("endereco");

			System.out.println(id + "\n" + nome + " \n " + email + "\n" + endereco);
		}
		Contato contato = new Contato();
		long id = Long.parseLong(req.getParameter("id"));
		String nome = rs.getString("nome");
		contato.setId(id);
		contato.setNome(nome);

		req.setAttribute("id", contato);

		System.out.println("chegou aqui 3");

		/*
		 * Contato contato = new Contato();
		 * 
		 * req.setAttribute("testeEDITA", contato); long id =
		 * Long.parseLong(req.getParameter("id")); String nome =
		 * (String)req.getParameter("nome");
		 * 
		 * System.out.println("chegou aqui 4");
		 * 
		 * contato.setId(id);
		 * 
		 * 
		 * contato.setNome(nome);
		 */

		return "/WEB-INF/jsp/alteracao.jsp";

	}

}
