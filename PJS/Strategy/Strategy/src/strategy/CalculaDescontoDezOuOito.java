/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author xacar
 */
public class CalculaDescontoDezOuOito implements CalculaDesconto {

    @Override
    public double calculaValorComDesconto(Lote lote) {
        if(lote.getQuantidadePessoas() <= 700){
            return lote.getValorBase() * 0.90; 
        }
        return lote.getValorBase() * 0.92; 
        
    }
    
}
