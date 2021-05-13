package br.com.mvc.logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.lang.jstl.parser.ParseException;

import br.com.conectaBanco.ConnectionFactory;
import br.com.dao.ContatoDao;
import br.com.model.Contato;
import sun.util.calendar.LocalGregorianCalendar.Date;

public class Altera implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		Connection con = new ConnectionFactory().getConnection();

		Contato contato = new Contato();
		// interface PreparedStatement para pesquisar no banco e montar o comando SQL,
		String sql = "update contatos set usuario=?, email=?, telefone=?," + "dataNascimento=? where id=?";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, contato.getUsuario());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getTelefone());

			stmt.setLong(5, contato.getId());
			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
			return "erro.html"; // para a execução do método

		}
		return "/WEB-INF/jsp/contato-adicionado.jsp";

	}
}
