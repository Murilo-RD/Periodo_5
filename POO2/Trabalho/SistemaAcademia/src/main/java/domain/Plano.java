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
    private double taxaPersonal;
    private String turnoTreino;
    private double valor;

    public Plano() {
    }

    public Plano(String plano, int frequenciaSemanal, double taxaPersonal, String turnoTreino) {
        this.plano = plano;
        this.frequenciaSemanal = frequenciaSemanal;
        this.taxaPersonal = taxaPersonal;
        this.turnoTreino = turnoTreino;
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

    public double getValorMensal(){
        switch(plano){
           case "Semanal" -> {
               return getValor()*4.35;
               
             }
           case "Mensal" -> {
               return getValor();
             }
           case "Trimestral" -> {
               return getValor()/3;
             }
           case "Semestral" -> {
               return getValor()/6;
             }
           case "Anual" ->{ 
               return getValor()/12;
             }
           default -> {
               return 0;
             }
        }
    }  
    
    
    public double getValor() {
        valor = (5 + taxaPersonal) * frequenciaSemanal;
        switch(plano){
           case "Semanal" -> {
               
             }
           case "Mensal" -> {
               valor = (valor*4.34);
             }
           case "Trimestral" -> {
               valor = (valor*(3*4.34))*0.92;
             }
           case "Semestral" -> {
               valor = (valor*(6*4.34))*0.90;
             }
           case "Anual" ->{ 
               valor = (valor*(12*4.34))*0.85;
             }
           default -> {
               return 0;
             }
       }
        
       switch(turnoTreino){
           case "Matutino" -> {
               valor= valor*0.98;
               return valor;
             }
           case "Vespertino" -> {
               valor= valor*0.99;
               return valor;
           }
           case "Noturno" -> {
               return valor;
           }
           default -> {
               return 0;
             }
       }
    }
}
