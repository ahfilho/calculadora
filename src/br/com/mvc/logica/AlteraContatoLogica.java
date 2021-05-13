package br.com.mvc.logica;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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


		  Connection con = new ConnectionFactory().getConnection();
		  PreparedStatement stmt = con.prepareStatement("select * from contatos");

		  ResultSet rs = stmt.executeQuery();

		  // itera no ResultSet
		  while (rs.next()) {
		    String usuario = rs.getString("usuario");
		    String email = rs.getString("email");
		    String telefone = rs.getString("telefone");
		    System.out.println(usuario + " _ " + email + "_"+ telefone);
		  }
		  
		  stmt.close();
		  con.close();
		  
//		req.setAttribute("contatos", contatos);


		return "/WEB-INF/jsp/alteracao.jsp";
	}

}