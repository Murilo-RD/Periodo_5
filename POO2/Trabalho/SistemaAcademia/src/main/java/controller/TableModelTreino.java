/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Exercicio;
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
        int maior = 0;
        for(Treino trei: treinos){
            if(trei.getExercicios().size() > maior){
                maior = trei.getExercicios().size();
            }
        }
        return maior;
    }

    @Override
    public int getColumnCount() {
        return treinos.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       if(columnIndex >= treinos.size())
           return null;         
       Treino treino = treinos.get(columnIndex);
       if(rowIndex >= treino.getExercicios().size())
           return null;
       return treino.getExercicios().get(rowIndex);
          
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
           case 0 -> {
               return "Dia 1";
             }
           case 1 -> {
               return "Dia 2";
             }
           case 2 -> {
               return "Dia 3";
             }
           case 3 -> {
               return"Dia 4";
             }
           case 4 -> { 
               return "Dia 5";
             }
           case 5 -> {
               return "Dia 6";
             }
           case 6 -> {
               return "Dia 7";
             }
           default -> {
               return null;
             }
       }
    }
    
    public Treino getTreino(int index){
        return treinos.get(index);
    }   
    
    public void setList(List<Treino> lista){
        treinos = lista;
        super.fireTableStructureChanged();
    }
    
    
    public void adicionar(Treino treino){
        treinos.add(treino);
        fireTableRowsInserted(treinos.size()-1,treinos.size()-1);
    }  
    
    public List<Treino> getList(){
        return treinos;
    }
    
    public void remover(Treino treino){
        treinos.remove(treino);
        fireTableRowsInserted(treinos.size()-1,treinos.size()-1);
    }
}

