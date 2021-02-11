package br.com.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.ContatoDao;
import br.com.model.Contato;

public class ListaContatosLogica implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		// Monta a lista de contatos
		List<Contato> contatos = new ContatoDao().getLista();

		// Guarda a lista no request
		req.setAttribute("contatos", contatos);

		System.out.println("LISTANDO TODOS OS CONTATOS...");
		return "/WEB-INF/jsp/lista-contatos.jsp";
	}
}