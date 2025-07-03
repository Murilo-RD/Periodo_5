/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author 2023122760220
 */

@Entity
public class Exercicio implements Serializable {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private int idExercicio;
    @Column (nullable = false)
    private String nome;
    private String grupoMuscular;
    private int qtdRepeticoes;
    private int qtdSeries;
    
    @ManyToMany ( mappedBy = "exercicios", fetch = FetchType.LAZY )
    private List<Treino> treino;
    
    
    public Exercicio() {
    }

    public Exercicio(String nome, String grupoMuscular, int qtdRepeticoes, int qtdSeries) {
        this.nome = nome;
        this.grupoMuscular = grupoMuscular;
        this.qtdRepeticoes = qtdRepeticoes;
        this.qtdSeries = qtdSeries;
    }

    
    @Override
    public String toString() {
        return nome+" - "+qtdSeries+" x "+qtdRepeticoes;
    }

    public String getNome() {
        return nome;
    }

    
    
    
    
    
}
