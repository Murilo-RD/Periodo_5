/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author xacar
 */
public class Main {
    
    public static void main(String args[]){
        Lote loteUm = new Lote(Lote.PRIMEIRO,1000,100);
        System.out.println(loteUm.getValorComDesconto());
        
        Lote loteDois = new Lote(Lote.PRIMEIRO,1000,400);
        System.out.println(loteDois.getValorComDesconto());
    
        Lote loteTres = new Lote(Lote.BONUS,1000,1000);
        System.out.println(loteTres.getValorComDesconto());
    }
    
    
    
}
