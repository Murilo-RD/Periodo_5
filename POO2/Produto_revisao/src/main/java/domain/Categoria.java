/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Xacar
 */
public class Categoria {
    private int idCategoria;
    private String descricao;

    public Categoria(int idCategoria, String descricao) {
        this.idCategoria = idCategoria;
        this.descricao = descricao;
    }
    public Categoria(String descricao) {
        this.descricao = descricao;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return descricao;
    }

    
    
    public int getIdCategoria() {
        return idCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
