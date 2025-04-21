/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Xacar
 */
public class TableModelProduto extends AbstractTableModel {

    private List<Produto> list = new ArrayList();
    
    
    public void setList(List<Produto> list){
        this.list = list;
    }
    
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public String getColumnName(int column) {
        switch ( column ) {
            case 0: return "ID produto";
            case 1: return "Nome";
            case 2: return "Quantidade";
            case 3: return "Preço";
            case 4: return "Categoria";          
        }
        return null;
    }

    public TableModelProduto() {
        this.list = list;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
            Produto item = (Produto) list.get(rowIndex);
            switch ( columnIndex ) {
                case 0: return item.getIdProduto();
                case 1: return item.getNom();
                case 2: return item.getQuntidade();
                case 3: return item.getPreco();
                case 4: return item.getCat().toString();          
            }
        
        return null;
    }
    
}
