package cadastroLutador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LutadorDao {
	
	private Connection conexao = null;
	private Statement statement = null;

	
	final private static String host = "jdbc:mysql://localhost:3306/dadoslutadores";
	final private static String user = "root";
	final private static String password = "igor123";
	
	public boolean conectar() {
		
		//Gerando conexão com o banco de dados
		try {
			conexao = DriverManager.getConnection(host, user, password);
			statement = conexao.createStatement();
			return true;
		} catch (SQLException e) {
			return false;
		}
		
		
		
	}
	
	//Método para verificar se o lutador já está cadastrado no banco de dados para que não haja duplicação 
	public boolean verificarLutador(int numcadastro) throws SQLException {
			String verificarSql;
			verificarSql = "SELECT COUNT(*) FROM dados WHERE numcadastro = ? "; //Comando em SQL que conta quantos registros 'numcadastro' existem na tabela 'dados'
			try (PreparedStatement statement = conexao.prepareStatement(verificarSql)) { //Criado para executar o comando SQL
				statement.setInt(1, numcadastro); //O Valor é inserido na primeira posição, substituindo o '?'
				try (ResultSet resultset = statement.executeQuery()){ //A query é executada e o resultado guardado em resultset
					if (resultset.next()) { //Condição para verificar se há algum resultado encontrado
						int count = resultset.getInt(1); //Obtém o valor da contagem de registros
						return count > 0; //Retorna 'true' se o número de registros for maior que 0
					}
				}
			}
			return false;
	
	//Foi usado o PreparedStatement por ser mais seguro na execução de comandos dinâmicos

	
	}
	
	//Método para salvar os lutadores na tabela do banco de dados
	public boolean salvarLutador(Lutador[] lutador)  {
		
			String sql;
			sql = "INSERT INTO dados (nomelut, nacionalidade, idade, sexo, altura, peso, vitorias, derrotas, empates, numcadastro) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
		
			try (PreparedStatement statement = conexao.prepareStatement(sql)) {
			
				for (Lutador l : lutador) {
					if (!verificarLutador(l.getNumcadastro())) { //Condição chamada para verificar se existe algum lutador com o registro cadastrado
					statement.setString(1, l.getNome());
					statement.setString(2, l.getNacionalidade());
					statement.setInt(3, l.getIdade());
					statement.setString(4, l.getSexo());
					statement.setFloat(5, l.getAltura());
					statement.setFloat(6, l.getPeso());
					statement.setInt(7, l.getVitorias());
					statement.setInt(8, l.getDerrotas());
					statement.setInt(9, l.getEmpates());
					statement.setInt(10, l.getNumcadastro());
					statement.executeUpdate(); //Executa o Uptade na tabela incluindo os dados
					}
				}
			return true;	
			} catch (SQLException e) {
			
			return false;
			
			}
		
	}
	
	//Método para desconectar da tabela SQL 
	public void desconect () {
		try {
			conexao.close();
		} catch (SQLException e) {
	
		}
	}
	
}
