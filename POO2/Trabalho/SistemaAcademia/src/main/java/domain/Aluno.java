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
public class Aluno extends Usuario implements Serializable {
    @Column (nullable = false)
    private double altura;
   
    @Column (nullable = false)
    private double peso;
    

    @ManyToOne
    @JoinColumn ( name = "id_personal")
    private Personal personal;
    
    @ManyToOne
    @JoinColumn ( name = "idPlano")
    private Plano plano;
    

    @OneToMany ( mappedBy = "aluno",
    fetch = FetchType.LAZY )
    private List<Treino> treinos;
    
    public Aluno() {
    }
    
    
}
