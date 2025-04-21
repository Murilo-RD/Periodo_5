
package dao;

import domain.Categoria;
import domain.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jean_
 */
public class CategoriaDAO {
          
    public void inserir(Categoria cat) throws ClassNotFoundException, SQLException{
        Statement stmt;
      stmt = ConexaoPGSQL.obterConexao().createStatement();
      String sql = "INSERT INTO categoria (descricao)  VALUES(?)";
      PreparedStatement pstmt = ConexaoPGSQL.obterConexao().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      pstmt.setString(1,cat.getDescricao());
       
      pstmt.execute();
      ResultSet res = pstmt.getGeneratedKeys();
      if (res.next()){
          int id = res.getInt(1);
          cat.setIdCategoria(id);
      }

        // Insere todos os dados da categoria no banco de dados       
	// Observe que o parâmetro é um objeto do tipo Categoria, 
        // portanto você deverá ler de um Frame os dados, criar um objeto 
        // do tipo Categoria e passar como parâmetro para essa função
        //
        // O ID da categoria é auto numeração
	//
	// INSERT INTO nome_tabela (CAMPOS separados por virgula)  VALUES 
        //    ( VALORES separados por vírgula )
    }
    
       public Categoria pesquisar (int id ) throws SQLException, ClassNotFoundException{
        Statement stmt;
        stmt = ConexaoPGSQL.obterConexao().createStatement();
        Categoria cat;
        
        String sql = "SELECT * FROM produto WHERE idCategoria = <" + id;
        ResultSet res = stmt.executeQuery(sql);
        cat = new Categoria(res.getInt("idCategoria"),res.getString("descricao"));
            
     
        return cat;

	// Pesquisa no banco pelo ID passado como parâmetro 
        //  e retorna um objeto do tipo Produto.
        //  Antes de retornar deve criar um objeto do tipo Produto.
        // SELECT * FROM nome_tabela WHERE campo_codigo = cod_pesquisa
        
    }  

    
    public List<Categoria> listar() throws SQLException, ClassNotFoundException{

	Statement stmt;
        stmt = ConexaoPGSQL.obterConexao().createStatement();
        List<Categoria> lista = new ArrayList();
        Categoria cat;
        
        String sql = "SELECT * FROM categoria";
        ResultSet res = stmt.executeQuery(sql);
        while(res.next()){
            cat = new Categoria(res.getInt("idCategoria"),res.getString("descricao"));
            lista.add(cat);
        }
        
        return lista;
    }
    


    
}
