package Exercicio03POO;

public class App {
    public static void main(String[] args) {

        BombaCombustivel bomba = new BombaCombustivel();
        
        bomba.alterarValorDoLitro(4.50);
        
        System.out.println(bomba.abastecerPorValor(50) + " litros");
        System.out.println("R$ " + bomba.abastecerPorLitro(50));
        
        bomba.alterarCombustivel("Gasolina");
        System.out.println("Combustível: " + bomba.getTipoCombustivel());
        
    }
}
