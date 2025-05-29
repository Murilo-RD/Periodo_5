/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author 2023122760220
 */
@Entity
public class Treino implements Serializable {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private int idTreino;
    
    @Column (nullable = false)
    private String diaSemana;
    
    @ManyToMany ( fetch = FetchType.LAZY )
    @JoinTable ( name="Treino_Exercicio",joinColumns = { @JoinColumn (name="idTreino") },inverseJoinColumns = { @JoinColumn(name="idExercicio") })
    private List<Exercicio> exercicios;
    //teste
    @ManyToOne
    @JoinColumn ( name = "id_aluno")
    private Aluno aluno;

    public Treino() {
    }

    public int getIdTreino() {
        return idTreino;
    }

    public void setIdTreino(int idTreino) {
        this.idTreino = idTreino;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
    
}
