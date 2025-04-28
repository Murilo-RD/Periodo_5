
package strategy;

public class Lote {
    public static final int PRIMEIRO = 1;
    public static final int SEGUNDO = 2;
    public static final int TERCEIRO = 3;
    public static final int BONUS = 4;
    
    private double valorBase;
    private int quantidadePessoas;
    private int numLote;
    private CalculaDesconto estrategiaDeCalculo;

    
    public Lote(int numLote, double valorBase,int quantidadePessoas) {
        this.valorBase = valorBase;
        this.quantidadePessoas = quantidadePessoas;
        switch(numLote){
            case PRIMEIRO: 
                estrategiaDeCalculo = new CalculaDescontoVinteOuDezoito();
                this.numLote = PRIMEIRO;
                break;
            case SEGUNDO: 
                estrategiaDeCalculo = new CalculaDescontoQuinzeOuDoze();
                this.numLote = SEGUNDO;
                break;
            case TERCEIRO: 
                estrategiaDeCalculo = new CalculaDescontoDezOuOito();
                this.numLote = TERCEIRO;
                break;
            case BONUS:
                estrategiaDeCalculo = new CalculaDescontoCincoOuTres();
                this.numLote = PRIMEIRO;
                break;
            default:
                throw new RuntimeException("Cargo Não Encontrado");
        
        }
    }
    
    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }


    public double getValorBase() {
        return valorBase;
    }
    
    public double getValorComDesconto() {
        return estrategiaDeCalculo.calculaValorComDesconto(this);
    }

    public int getNumLote() {
        return numLote;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }
    
    
    

    
}
