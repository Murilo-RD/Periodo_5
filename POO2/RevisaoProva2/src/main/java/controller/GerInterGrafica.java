/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import viewer.JanelaPrincipalJF;

/**
 *
 * @author Xacar
 */
public class GerInterGrafica {
    
    private JanelaPrincipalJF janelaPrincipal = null;
    
    public static void main(String args[]) {
        GerInterGrafica gerIG = new GerInterGrafica();
        gerIG.abrirJanelaPrincipal();
    }
    
    public void abrirJanelaPrincipal(){
        if(janelaPrincipal == null)
            janelaPrincipal = new JanelaPrincipalJF(this);
        janelaPrincipal.setVisible(true);
    }
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class,GerInterGrafica.class).newInstance(parent,true,this);                                
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex.getMessage() );
            } 
        }               
        dlg.setVisible(true); 
        return dlg;
    }    
}
