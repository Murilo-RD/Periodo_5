/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import javax.persistence.Entity;

/**
 *
 * @author 2023122760220
 */

@Entity
public class Exercicio {
    
    private int idExercicio;
    private String nome;
    private String grupoMuscular;
    private int qtdRepeticoes;
    private int qtdSeries;

    public Exercicio() {
    }
    
    
    
}
