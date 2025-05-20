/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
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
    
    @Column (nullable = false)
    @OneToMany ( mappedBy = "personal",
    fetch = FetchType.LAZY )
    private List<Aluno> alunos;

    public Personal() {
    }
    
    
    
}
