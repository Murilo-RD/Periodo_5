/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.CategoriaDAO;
import dao.ConexaoPGSQL;
import dao.ProdutoDAO;
import domain.Categoria;
import domain.Produto;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xacar
 */
public class GerDominio {

    ProdutoDAO produtoDAO;
    CategoriaDAO categoriaDAO;

    public GerDominio() throws SQLException, ClassNotFoundException {

        ConexaoPGSQL.obterConexao();
        categoriaDAO = new CategoriaDAO();
        produtoDAO = new ProdutoDAO();
    }
    
    /// ---------Produto---------
    
    public void inserirProduto(Produto prod) throws ClassNotFoundException, SQLException{
        produtoDAO.inserir(prod);
    }
    
    public void alterarProduto(Produto prod) throws ClassNotFoundException, SQLException{
        produtoDAO.alterar(prod);
    }
    
    public Produto PesquisarProdutos(int id) throws ClassNotFoundException, SQLException {
        return produtoDAO.pesquisar(id);
    }
    
    
    public List<Produto> listarProdutos() throws ClassNotFoundException, SQLException {
        return produtoDAO.listar();
    }

    public List<Produto> listarProdutos(int limite) throws ClassNotFoundException, SQLException {
        return produtoDAO.listar(limite);
    }

    public List<Produto> listarProdutos(Categoria cat) throws ClassNotFoundException, SQLException {
        return produtoDAO.listar(cat);
    }
    
    
    /// ---------categoria---------
    
    public void inserirCategoria(Categoria cat) throws ClassNotFoundException, SQLException{
       categoriaDAO.inserir(cat);
    }
    
    public Categoria PesquisarCategoria(int id) throws ClassNotFoundException, SQLException {
        return categoriaDAO.pesquisar(id);
    }
    
    public List<Categoria> listarCategorias() throws SQLException, ClassNotFoundException {
        return categoriaDAO.listar();
    }

}
