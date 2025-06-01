/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 *
 * @author Xacar
 */

@Entity
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public abstract class Usuario implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.SEQUENCE )
    private int idUsuario;
    
    @Column (nullable = false)
    private String nome;
    @Column (nullable = false)
    private String cpf;
    
    @Column (nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date datNascimento;
    
    @Column (nullable = false)
    private String sexo;

    public Usuario(String nome, String cpf, Date datNascimento, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.datNascimento = datNascimento;
        this.sexo = sexo;
    }

    
    
    
    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDatNascimento() {
        return datNascimento;
    }

    public void setDatNascimento(Date datNascimento) {
        this.datNascimento = datNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    
}
