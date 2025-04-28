/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Categoria;
import domain.Produto;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import viewer.ProdutoMain;

/**
 *
 * @author Xacar
 */
public class GerInterGrafica {
    private ProdutoMain janelaPrincipal = null;
    private GerDominio gerDominio;

    public GerInterGrafica() {
        try {
            gerDominio = new GerDominio();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(janelaPrincipal, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(janelaPrincipal, ex);
        }
    }

    public GerDominio getGerDominio() {
        return gerDominio;
    }
    
    public void alterarProduto(int id,String nome,int qtde, double preco, Categoria cat){
        try {
            Produto prod = new Produto(id,nome, qtde, preco,cat);
            gerDominio.alterarProduto(prod);
            JOptionPane.showMessageDialog(janelaPrincipal,"Alterado com sucesso");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(janelaPrincipal,"Erro ao Alterar: "+ex);
        }
    }
    
    
    public int inserirProduto(String nome,int qtde, double preco, Categoria cat){
        try {
            Produto prod = new Produto(nome, qtde, preco,cat);
            gerDominio.inserirProduto(prod);
            JOptionPane.showMessageDialog(janelaPrincipal,"inserido com sucesso");
            return prod.getIdProduto();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(janelaPrincipal,"Erro ao Inserir: "+ex);
        }
        return 0;
    }
    
    public void inserirCategoria(String desc){
        try {
            gerDominio.inserirCategoria(new Categoria(desc));
            JOptionPane.showMessageDialog(janelaPrincipal,"inserido com sucesso");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(janelaPrincipal,"Erro ao Inserir: "+ex);
        }
    }
    
    
    public static void main(String args[]) {
       
        GerInterGrafica gerIG = new GerInterGrafica();
        gerIG.abrirJanelaPrincipal(); 
    }
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class,GerInterGrafica.class).newInstance(parent,true,this);                                
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex.getMessage() );
            } 
        }               
        dlg.setVisible(true); 
        return dlg;
    }    
    
    
    public void carregarCombo(JComboBox combo){
        try {
            List<Categoria> lista = gerDominio.listarCategorias();
            combo.setModel(new DefaultComboBoxModel(lista.toArray()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(janelaPrincipal,"Erro ao carregar categorias: "+ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(janelaPrincipal,"Erro ao carregar categorias: "+ex);
        }
    }
    
    
    public void abrirJanelaPrincipal(){
        if(janelaPrincipal == null)
            janelaPrincipal = new ProdutoMain(this);
        janelaPrincipal.setVisible(true);
    }
  
    
    
    
}
