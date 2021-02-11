package br.com.mvc.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.ContatoDao;
import br.com.model.Contato;

public class AdicionaContatoLogica implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("ADICIONANDO NO BANCO");
		return "/WEB-INF/jsp/adiciona-contato.jsp";
	}

}
