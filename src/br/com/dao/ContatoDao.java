package br.com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.conectaBanco.ConnectionFactory;
import br.com.model.Contato;

public class ContatoDao {

	// parado ate resolver o metodo adicionar, depois voltar ao filtro.
	/*
	 * //construtor que recebe conexão e armazena no atributo public
	 * ContatoDao(Connection connection) { this.connection = connection; }
	 */
	private Connection connection;
	// inicia uma conexão privada com um atributo privado

	// constutor que vai receber um objeto da nova conexão
	public ContatoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	// metodo para remover do banco
	public void remover(Contato contato) {
		try {
			// instruções para o banco
			PreparedStatement stmt = connection.prepareStatement("delete from contatos where id=?");
			// vai deletar da tabela contatos onde o if for igual ao id informado
			stmt.setLong(1, contato.getId()); // id informado
			stmt.execute(); // executa a ação
			stmt.close(); // fecha a conexão
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void adicionaNoBanco(Contato contato) {

		String sql = "insert into contatos" + "(nome,email,endereco,dataNascimento)" + "values(?,?,?,?)";
		try {
			// preparedStatement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);

			// setando os valores que serão inseridos no banco
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new java.sql.Date(contato.getDataNascimento().getTimeInMillis()));

			// executa a operação
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Contato pesquisaBanco(long id) throws SQLException {
		// pega a conexão e o statement
		Connection conexao = new ConnectionFactory().getConnection();
		PreparedStatement stmt = connection.prepareStatement("select * from contatos where id=?");

		stmt.setLong(1, id);

		// executa um select na tabela contatos e retorna os registros de uma
		// determinada query
		ResultSet rs = stmt.executeQuery();

		Contato contato = null;

		// O OBJETO RETORNADO É UM RESULTSET, permite navegar por seus registros através
		// do método NEXT
		// VAI RETORNAR FALSE QUANDO CHEGAR AO FIM DA PESQUISA NA TABELA

		// itera no resultset
		if (rs.next()) {
			contato = new Contato();
			contato.setId(id);

			// para retornar o valor de uma coluna do banco, basta chamar um dos métodos get
			// do RESULTSET
			/*
			 * String nome = rs.getString("id"); String email = rs.getString("email");
			 * String endereco = rs.getString("endereco"); String dataNascimento =
			 * rs.getString("dataNascimento");
			 * 
			 * System.out.println(nome+"---"+ email +"---" + endereco + "" +
			 * dataNascimento);
			 * 
			 */

		}

//	rs.close();  //fecha a iteração ao final
		stmt.close(); // encerra o statement
		conexao.close(); // fecha a conexão ao final

		return contato;
	}

	public List<Contato> getLista() {
		try {
			List<Contato> contatos = new ArrayList<Contato>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from contatos");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Contato
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);

				// adicionando o objeto à lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

//ALTERAR
	public void altera(Contato contato) {
//recebe um contato
		// os valores que serão atualizados na tabela contato
		String sql = "update contatos set nome=?, email=?, endereco=?," + "dataNascimento=? where id=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

			stmt.setLong(5, contato.getId());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
