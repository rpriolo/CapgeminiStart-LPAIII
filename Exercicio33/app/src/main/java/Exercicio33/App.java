/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio33;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        char nivelProfessor;
        int horasTrabalhadas;
        double valorAReceber;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe seu nível: ");
        nivelProfessor = leitor.next().charAt(0);
        
        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        horasTrabalhadas = leitor.nextInt();
        
        if (nivelProfessor == '1') {
            valorAReceber = horasTrabalhadas * 12.00;
        } else if (nivelProfessor == '2') {
            valorAReceber = horasTrabalhadas * 17.00;
        } else {
            valorAReceber = horasTrabalhadas * 25.00;
        }
        
        System.out.println("Seu valor a receber é: R$ " + valorAReceber);
        
        
        
    }
}
