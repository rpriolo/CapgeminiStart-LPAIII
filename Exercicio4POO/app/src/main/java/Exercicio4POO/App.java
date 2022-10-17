package Exercicio4POO;

public class App {
    public static void main(String[] args) {

        Invoice fatura1 = new Invoice(2, "Monitor", 1, 820);
        Invoice fatura2 = new Invoice(3, "Mouse", 3, 24.90);
        Invoice fatura3 = new Invoice(4, "Teclado", 3, 74.50);
        Invoice fatura4 = new Invoice(10, "Teste", 12, -52.50);
        
        System.out.println("Total da FATURA 1: R$ " + fatura1.getInvoiceAmount());
        System.out.println("Total da FATURA 2: R$ " + fatura2.getInvoiceAmount());
        System.out.println("Total da FATURA 3: R$ " + fatura3.getInvoiceAmount());
        System.out.println("Total da FATURA 4: R$ " + fatura4.getInvoiceAmount());
        System.out.println("INFOS FATURA 4: " + fatura4.getNumeroItem() + "," + fatura4.getDescricaoItem() + "," + fatura4.getQtdeCompradaItem() + "," + fatura4.getPrecoUnitarioItem());
        

            
    
    }
}
