package Exercicio03POO;

public class BombaCombustivel {

    private String tipoCombustivel;
    private double valorPorLitro;
    private double quantidadeLitros;
    
    
    public double abastecerPorValor(double valor) {
        this.quantidadeLitros = valor / this.valorPorLitro;
        return this.quantidadeLitros;
    }

    public double abastecerPorLitro(double litros) {
        double valorAPagar = litros * this.valorPorLitro;
        return valorAPagar;
    }

    public void alterarValorDoLitro(double novoValor) {
        this.valorPorLitro = novoValor;
    }
    
    public void alterarCombustivel(String combustivel) {
        this.tipoCombustivel = combustivel;
    }
    
    public void alterarQuantidadeCombustivel(double quantidadeCombustivelRestante) {
        
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    
    
    
}
