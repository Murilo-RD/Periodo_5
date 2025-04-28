/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author xacar
 */
public class CalculaDescontoVinteOuDezoito implements CalculaDesconto{

    @Override
    public double calculaValorComDesconto(Lote lote) {
       if(lote.getQuantidadePessoas() <= 300){
            return lote.getValorBase() * 0.80; 
        }
        return lote.getValorBase() * 0.82; 
    }
    
}
