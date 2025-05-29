/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Treino;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author xacar
 */
public class TableModelTreino extends AbstractTableModel{

     private List<Treino> treinos = new ArrayList();
    
    
    @Override
    public int getRowCount() {
        
        
        return treinos.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Personal personal = personais.get(rowIndex);
       switch(columnIndex){
           case 0 -> {
               return personal.getNome();
             }
           case 1 -> {
               return personal.getCpf();
             }
           case 2 -> {
               return personal.getDatNascimento();
             }
           case 3 -> {
               return personal.getSexo();
             }
           case 4 -> { 
               return personal.getTipoCurso();
             }
           case 5 -> {
               return personal.getUniversidade();
             }
           case 6 -> {
               return personal.getValorCobrado();
             }
           case 7 -> {
               return personal.getAlunos().size();
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
               return "Tipo de Curso";
             }
           case 5 -> {
               return "Universidade";
             }
           case 6 -> {
               return "Valor Dia";
             }
           case 7 -> {
               return "QTD Alunos";
             }
           default -> {
               return null;
             }
       }
    }
    
    
    
    
    void adicionar(Personal personal){
        personais.add(personal);
        fireTableRowsInserted(personais.size()-1,personais.size()-1);
    }  
    
    void remover(Personal personal){
        personais.remove(personal);
        fireTableRowsInserted(personais.size()-1,personais.size()-1);
    }
}

