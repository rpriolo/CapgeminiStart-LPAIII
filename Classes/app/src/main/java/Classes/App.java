package Classes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        Pessoa p = new Pessoa(0, 0);
        
        System.out.print("Informe o peso: ");
        p.setPeso(leitor.nextFloat());
        System.out.print("Informe a altura: ");
        p.setAltura(leitor.nextFloat());

        System.out.println("Com " + p.getPeso() + "kg e " + p.getAltura() + "m,"
                + " o IMC dessa pessoa é " + p.calcularIMC());
        
    }
}
