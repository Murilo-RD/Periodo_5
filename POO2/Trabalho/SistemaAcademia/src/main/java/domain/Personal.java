/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author 2023122760220
 */
@Entity
public class Personal extends Usuario implements Serializable{
    @Column (nullable = false)
    private String tipoCurso;
    private String universidade;
    private double valorCobrado;

    @OneToMany ( mappedBy = "personal",
    fetch = FetchType.EAGER)
    private List<Aluno> alunos;

    public Personal(String tipoCurso, String universidade, double valorCobrado, String nome, String cpf, Date datNascimento, String sexo) {
        super(nome, cpf, datNascimento, sexo);
        this.tipoCurso = tipoCurso;
        this.universidade = universidade;
        this.valorCobrado = valorCobrado;
        alunos = new ArrayList();
    }
    
    
    
    
    
    public Personal() {
        
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    @Override
    public String toString() {
        return this.getNome()+" - "+universidade; 
    }
    
    
    
    
    
    
    
}
