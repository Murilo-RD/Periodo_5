/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author 2023122760220
 */

@Entity
public class Plano implements Serializable {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private int idPlano;
    private String plano;
    private int frequenciaSemanal;
    private String turnoTreino;
    private double valor;

    public Plano() {
    }
    
    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public int getFrequenciaSemanal() {
        return frequenciaSemanal;
    }

    public void setFrequenciaSemanal(int frequenciaSemanal) {
        this.frequenciaSemanal = frequenciaSemanal;
    }

    public String getTurnoTreino() {
        return turnoTreino;
    }

    public void setTurnoTreino(String turnoTreino) {
        this.turnoTreino = turnoTreino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
