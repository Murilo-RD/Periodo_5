/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Xacar
 */
public class Computador {
    
    private String nome;
    private String SO;
    private String versao;
    private String hd;
    private String cidade;
    private String memRAM;
    private String processador;

    public Computador(String nome, String SO, String versao, String hd, String cidade, String memRAM, String processador) {
        this.nome = nome;
        this.SO = SO;
        this.versao = versao;
        this.hd = hd;
        this.cidade = cidade;
        this.memRAM = memRAM;
        this.processador = processador;
    }
    

    public String getNome() {
        return nome;
    }

    public String getSO() {
        return SO;
    }

    public String getVersao() {
        return versao;
    }

    public String getHd() {
        return hd;
    }

    public String getCidade() {
        return cidade;
    }

    public String getMemRAM() {
        return memRAM;
    }

    public String getProcessador() {
        return processador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setMemRAM(String memRAM) {
        this.memRAM = memRAM;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    
    
    
    
    
}
