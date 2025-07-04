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
public class Aluno extends Usuario implements Serializable {
    
    
    @Column (nullable = false)
    private int altura;
   
    @Column (nullable = false)
    private double peso;
    

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn ( name = "id_personal")
    private Personal personal;
    
    @ManyToOne
    @JoinColumn (name = "idPlano")
    private Plano plano;
    
    @OneToMany ( mappedBy = "aluno",
    fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Treino> treinos;

    public Aluno(int altura, double peso, Personal personal, Plano plano, String nome, String cpf, Date datNascimento, String sexo) {
        super(nome, cpf, datNascimento, sexo);
        this.altura = altura;
        this.peso = peso;
        this.personal = personal;
        this.plano = plano;
    }

  
    
    public Aluno() {
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public List<Treino> getTreinos() {
        if (treinos == null||treinos.isEmpty()){
            treinos= new ArrayList();
            for(int i=1;i<=plano.getFrequenciaSemanal();i++ ){
                treinos.add(new Treino("Dia "+i,this));
            }
        }
        return treinos;
    }

    public void setTreinos(List<Treino> treinos) {
        this.treinos = treinos;
    }
    
    
    
    
}
