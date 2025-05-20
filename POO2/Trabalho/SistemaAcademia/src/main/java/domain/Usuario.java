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

@Entity // ou @MappedSuperclass
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
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

    public Usuario() {
    }

    
    
}
