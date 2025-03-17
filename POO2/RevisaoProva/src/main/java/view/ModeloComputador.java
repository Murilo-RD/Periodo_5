/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import domain.Computador;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Xacar
 */
public class ModeloComputador extends AbstractTableModel{

     private List<Computador> computadores = new ArrayList();
    
    
    @Override
    public int getRowCount() {
        return computadores.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Computador comp = computadores.get(rowIndex);
       switch(columnIndex){
           case 0 -> {
               return comp.getNome();
             }
           case 1 -> {
               return comp.getCidade();
             }
           case 2 -> {
               return comp.getSO();
             }
           case 3 -> {
               return comp.getVersao();
             }
           case 4 -> { 
               return comp.getProcessador();
             }
           case 5 -> {
               return comp.getHd();
             }
           case 6 -> {
               return comp.getMemRAM();
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
               return "Cidade";
             }
           case 2 -> {
               return "SO";
             }
           case 3 -> {
               return"Versão";
             }
           case 4 -> { 
               return "Processador";
             }
           case 5 -> {
               return "HD";
             }
           case 6 -> {
               return "Memória";
             }
           default -> {
               return null;
             }
       }
    }
    
    
    
    
    void adicionar(Computador comp){
        computadores.add(comp);
        fireTableRowsInserted(computadores.size()-1,computadores.size()-1);
    }  
    
    void remover(Computador comp){
        computadores.remove(comp);
        fireTableRowsInserted(computadores.size()-1,computadores.size()-1);
    }
}
