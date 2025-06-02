/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Aluno;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.MaterialLiteTheme;
import org.hibernate.HibernateException;
import viewer.AlterarJD;
import viewer.CadastroJD;
import viewer.ConsultarJD;
import viewer.ListarJD;
import viewer.PrincipalJF;
import viewer.TreinoJD;


/**
 *
 * @author Xacar
 */
public class GerInterGrafica {
    PrincipalJF janelaPrincipal = null;
    CadastroJD janelaCadastro = null;
    ConsultarJD janelaConsultar = null;
    ListarJD janelaListar = null;
    AlterarJD janelaAlterar = null;
    TreinoJD janelaTreino = null;
    private GerDominio gerDominio;
    
    
    public GerInterGrafica() {
       try {
            gerDominio = new GerDominio();
        } catch (java.lang.ExceptionInInitializerError | HibernateException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro ao inicializar.", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new MaterialLookAndFeel(new MaterialLiteTheme()));
            UIManager.put("Button.foreground", java.awt.Color.BLACK);
            //UIManager.put("Button.background", );
            //UIManager.put("Button.border", null);
            
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } 
        
        //</editor-fold>

        /* Create and display the form */
        GerInterGrafica gerIG = new GerInterGrafica();
        gerIG.abrirJanelaPrincipal();
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

    public GerDominio getGerDominio() {
        return gerDominio;
    }
    
    public void abrirJanelaPrincipal(){
        if(janelaPrincipal == null)
            janelaPrincipal = new PrincipalJF(this);
        janelaPrincipal.setVisible(true);
    }
    public void abrirJanelaCadastro(){
       abrirJanela(janelaPrincipal,janelaCadastro,CadastroJD.class);
    }
    public void abrirJanelaConsultar(){
       abrirJanela(janelaPrincipal,janelaConsultar,ConsultarJD.class);
    }
    
    public void abrirJanelaListar(){
        abrirJanela(janelaPrincipal,janelaListar,ListarJD.class);
    }
    
    public void abrirJanelaAlterar(){
        abrirJanela(janelaPrincipal,janelaAlterar,AlterarJD.class);
    }
    
    public void abrirJanelaTreino(Aluno aluno){
        if(janelaTreino == null )
            janelaTreino = new TreinoJD(janelaPrincipal,true,this,aluno);
        else{
            janelaTreino.setAluno(aluno);    
        }
        janelaTreino.setVisible(true);
            
       
        
    }
    
    
    
}
