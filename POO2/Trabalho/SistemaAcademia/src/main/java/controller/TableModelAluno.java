/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Aluno;
import domain.Plano;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author xacar
 */
public class TableModelAluno extends AbstractTableModel{

     private List<Aluno> alunos = new ArrayList();
    
    
    @Override
    public int getRowCount() {
        return alunos.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Aluno aluno = alunos.get(rowIndex);
       switch(columnIndex){
           case 0 -> {
               return aluno.getNome();
             }
           case 1 -> {
               return aluno.getCpf();
             }
           case 2 -> {
               return aluno.getDatNascimento();
             }
           case 3 -> {
               return aluno.getSexo();
             }
           case 4 -> { 
               return aluno.getAltura();
             }
           case 5 -> {
               return aluno.getPeso();
             }
           case 6 -> {
               return aluno.getPersonal().getNome();
             }
           case 7 -> {
               Plano pla = aluno.getPlano();
               return String.format("%.2f",pla.getValor());
           }
           case 8 -> {
               return aluno.getPlano().getPlano();
           }
           
           default -> {
               return null;
             }
       }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
           case 0 -> {
               return "Nome";
             }
           case 1 -> {
               return "CPF";
             }
           case 2 -> {
               return "Data Nascimento";
             }
           case 3 -> {
               return"Sexo";
             }
           case 4 -> { 
               return "Aultura(cm)";
             }
           case 5 -> {
               return "Peso(Kg)";
             }
           case 6 -> {
               return "Personal";
             }
           case 7 -> {
               return "Valor Plano";
             }
           case 8 -> {
               return "Plano";
             }
           default -> {
               return null;
             }
       }
    }

    public void setList(List<Aluno> alunos) {
        this.alunos = alunos;
        this.fireTableDataChanged();
    }

    public List<Aluno> getList() {
        return alunos;
    }
    
    public Aluno getAluno(int idx){
        return alunos.get(idx);
    }
    
    
    
    void adicionar(Aluno aluno){
        alunos.add(aluno);
        fireTableRowsInserted(alunos.size()-1,alunos.size()-1);
    }  
    
    void remover(Aluno aluno){
        alunos.remove(aluno);
        fireTableRowsInserted(alunos.size()-1,alunos.size()-1);
    }
}

