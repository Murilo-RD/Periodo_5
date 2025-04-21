
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
public class ProdutoDAO {
    public void inserir(Produto prod) throws ClassNotFoundException, SQLException{
        
      Statement stmt;
      stmt = ConexaoPGSQL.obterConexao().createStatement();
      String sql = "INSERT INTO produto(nome,quantidade,preco,idCategoria) VALUES(?,?,?,?)";
      PreparedStatement pstmt = ConexaoPGSQL.obterConexao().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      pstmt.setString(1,prod.getNom());
      pstmt.setInt(2,prod.getQuntidade());
      pstmt.setDouble(3,prod.getPreco());
      pstmt.setInt(4,prod.getCat().getIdCategoria());
       
      pstmt.execute();
      ResultSet res = pstmt.getGeneratedKeys();
      if (res.next()){
          int id = res.getInt(1);
          prod.setIdProduto(id);
      }
    }

    
    public void alterar (Produto prod) throws ClassNotFoundException, SQLException{
        
      Statement stmt;
      stmt = ConexaoPGSQL.obterConexao().createStatement();
      String sql = "UPDATE produto  SET(nome,quantidade,preco,idCategoria) = (?,?,?,?) WHERE idProduto = " + prod.getIdProduto();
      PreparedStatement pstmt = ConexaoPGSQL.obterConexao().prepareStatement(sql);
      pstmt.setString(1,prod.getNom());
      pstmt.setInt(2,prod.getQuntidade());
      pstmt.setDouble(3,prod.getPreco());
      pstmt.setInt(4,prod.getCat().getIdCategoria());
       
      pstmt.execute();
      ResultSet res = pstmt.getGeneratedKeys();
      if (res.next()){
          int id = res.getInt(1);
          prod.setIdProduto(id);
      }
        
	// Altera no banco os dados do produto
        // O código do produto deve ser um produto já inserido
        // Os demais campos são os novos dados
        // UPDATE nome_tabela SET campos = novos_valores
        //	WHERE campo_codigo = cod

    }

    public Produto pesquisar (int id ) throws SQLException, ClassNotFoundException{
        Statement stmt;
        stmt = ConexaoPGSQL.obterConexao().createStatement();
        Produto prod;
        Categoria cat;
        
        String sql = "SELECT * FROM produto P, categoria C WHERE C.idcategoria = P.idcategoria AND P.idProduto = " + id;
        ResultSet res = stmt.executeQuery(sql);
        res.next();
        cat = new Categoria(res.getInt("idCategoria"),res.getString("descricao"));
        prod = new Produto(res.getInt("idProduto"),res.getString("nome"),res.getInt("quantidade"),res.getDouble("preco"),cat);
            
        return prod;

	// Pesquisa no banco pelo ID passado como parâmetro 
        //  e retorna um objeto do tipo Produto.
        //  Antes de retornar deve criar um objeto do tipo Produto.
        // SELECT * FROM nome_tabela WHERE campo_codigo = cod_pesquisa
        
    }    

    public List<Produto> listar(int limite) throws ClassNotFoundException, SQLException{
        Statement stmt;
        stmt = ConexaoPGSQL.obterConexao().createStatement();
        List<Produto> lista = new ArrayList();
        Produto prod;
        Categoria cat;
        
        String sql = "SELECT * FROM produto P, categoria C WHERE C.idcategoria = P.idcategoria AND P.quantidade <="+limite;
        ResultSet res = stmt.executeQuery(sql);
        while(res.next()){
            cat = new Categoria(res.getInt("idCategoria"),res.getString("descricao"));
            prod = new Produto(res.getInt("idProduto"),res.getString("nome"),res.getInt("quantidade"),res.getDouble("preco"),cat);
            lista.add(prod);
        }
        return lista;
    }

    public List<Produto> listar() throws ClassNotFoundException, SQLException{
        Statement stmt;
        stmt = ConexaoPGSQL.obterConexao().createStatement();
        List<Produto> lista = new ArrayList();
        Produto prod;
        Categoria cat;
        
        String sql = "SELECT * FROM produto P, categoria C WHERE C.idcategoria = P.idcategoria";
        ResultSet res = stmt.executeQuery(sql);
        while(res.next()){
            cat = new Categoria(res.getInt("idCategoria"),res.getString("descricao"));
            prod = new Produto(res.getInt("idProduto"),res.getString("nome"),res.getInt("quantidade"),res.getDouble("preco"),cat);
            lista.add(prod);
        }
        return lista;
    }
    
    public List<Produto> listar(Categoria cat) throws ClassNotFoundException, SQLException{

	Statement stmt;
        stmt = ConexaoPGSQL.obterConexao().createStatement();
        List<Produto> lista = new ArrayList();
        Produto prod;
        
        
        String sql = "SELECT * FROM produto P, categoria C WHERE C.idcategoria = P.idcategoria AND P.idcategoria = "+ cat.getIdCategoria();
        ResultSet res = stmt.executeQuery(sql);
        while(res.next()){
            cat = new Categoria(res.getInt("idCategoria"),res.getString("descricao"));
            prod = new Produto(res.getInt("idProduto"),res.getString("nome"),res.getInt("quantidade"),res.getDouble("preco"),cat);
            lista.add(prod);
        }
        return lista;
    }

    
}
