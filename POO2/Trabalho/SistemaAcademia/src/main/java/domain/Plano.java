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
    
    
}
