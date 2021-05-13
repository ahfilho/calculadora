package br.com.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String usuario = req.getParameter("usuario");
		String senha = req.getParameter("senha");

		System.out.println(req.getParameter("usuario"));
		System.out.println(req.getParameter("senha"));

		String usuario1 = "user";
		String senha1 = "123";

		if (usuario.equals("user") & senha.equals("123")) {
			System.out.println("LOGIN EFETUADO");

			return "/WEB-INF/jsp/adiciona-contato.jsp";

		} else {
			System.out.println("ERRO");
			return "/WEB-INF/jsp/erro.html";

		}
	}
}
