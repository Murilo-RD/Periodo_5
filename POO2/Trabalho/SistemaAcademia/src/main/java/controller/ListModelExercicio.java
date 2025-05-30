/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Exercicio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Xacar
 */
public class ListModelExercicio implements ListModel {

    private List<Exercicio> exercicios = new ArrayList<>();
    private final List<ListDataListener> ouvintes = new ArrayList<>();
    
    
    public void setList(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }
    
    
    public int getSize() {
        return exercicios.size();
    }

    @Override
    public Object getElementAt(int index) {
       return exercicios.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        ouvintes.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        ouvintes.remove(l);
    }
    
    
}
