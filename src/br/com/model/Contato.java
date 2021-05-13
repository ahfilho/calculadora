package br.com.model;

import java.util.Calendar;

public class Contato {
	// UMA JAVA BEAN

	private Long id;
	private String usuario;
	private String email;
	private String telefone;
	private Calendar dataNascimento;

	public Long getId() {
		return this.id;
	}

	public void setId(Long novo) {
		this.id = novo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String novo) {
		this.email = novo;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
