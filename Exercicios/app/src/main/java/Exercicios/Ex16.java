package Exercicios;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Informe seu nome: ");
        String nome = read.nextLine();

        System.out.print("Informe a nota da PROVA 1: ");
        double nota1 = read.nextDouble();
        
        System.out.print("Informe a nota da PROVA 2: ");
        double nota2 = read.nextDouble();

        System.out.print("Informe a nota da PROVA 3: ");
        double nota3 = read.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aluno " + nome + " aprovado com média " + media);
        } else if (media > 5) {
            System.out.println("Aluno " + nome + " de recuperação com média " + media);
        } else {
            System.out.println("Aluno " + nome + " reprovado com média " + media);
        }

        
    }
}
