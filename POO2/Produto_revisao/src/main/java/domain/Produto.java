/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Xacar
 */
public class Produto {
    private int idProduto;

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    private String nom;
    private int quntidade;
    private double preco;
    private Categoria cat;
    
    
    public Produto(int idProduto, String nom, int quntidade, double preco, Categoria cat) {
        this.idProduto = idProduto;
        this.nom = nom;
        this.quntidade = quntidade;
        this.preco = preco;
        this.cat = cat;
    }
    public Produto( String nom, int quntidade, double preco, Categoria cat) {
        this.nom = nom;
        this.quntidade = quntidade;
        this.preco = preco;
        this.cat = cat;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuntidade() {
        return quntidade;
    }

    public void setQuntidade(int quntidade) {
        this.quntidade = quntidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }
    
    
  
}
