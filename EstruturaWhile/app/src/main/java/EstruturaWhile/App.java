
package EstruturaWhile;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        int opcao = -1;
       
        while (opcao != 0) {            
            System.out.println("1. CADASTRAR");
            System.out.println("2. PESQUISAR");
            System.out.println("3. EXCLUIR");
            System.out.println("Digite 0 (ZERO) para sair");

            System.out.println("Digite a opção desejada");
            opcao = leitor.nextInt();
        }
        
                
    }
}
