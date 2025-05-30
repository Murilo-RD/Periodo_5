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
    private List<Treino> treinos;

    public Exercicio() {
    }

    @Override
    public String toString() {
        return nome+" - "+qtdSeries+" x "+qtdRepeticoes;
    }
    
    
    
}
