package br.com.dao;

import java.sql.Connection;

//import com.mysql.jdbc.PreparedStatement;

import br.com.conectaBanco.ConnectionFactory;
import br.com.model.Funcionario;

public class FuncionarioDao {

	
	//criar uma conexão privada
	private Connection connection;
	
	//um construtor publico onde a variável da conexão receberá um objeto da conexão
	public FuncionarioDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	
	//método adicionar no banco
	public void adicionaFuncionario(Funcionario funcionario){
		
		//string de consulta
		String sql = "insert into funcionario"+
		"(nome,usuario,senha)"+"values(?,?,?)"; 
		//try {
			//uma forma de você fazer uma inserção no banco mais segura, onde você prepara os parametros para serem inseridos. evitando assim ataques como o sql injection.
			//O preparedStatement assume a responsabilidade de montar a sua query (String) , sem que você tenha que concatenar as condições, desde que você passe os parâmetros corretamente. =]
			
		//	PreparedStatement ps = connection.prepareStatement(sql);
			//ps.setString(1, funcionario.getNome());
			//ps.setString(2, funcionario.getUsuario());
			//ps.setString(3, funcionario.getSenha());
			
			
			//ps.execute();
			//ps.close();
			///////////////////// PAREI AQUI
		//}
		
	}
	}
	
