package Exercicio4POO;

public class Invoice {

    private int numeroItem;
    private String descricaoItem;
    private int qtdeCompradaItem;
    private double precoUnitarioItem;

    public Invoice(int numeroItem, String descricaoItem, int qtdeCompradaItem, double precoUnitarioItem) {
        this.setNumeroItem(numeroItem);
        this.setDescricaoItem(descricaoItem);
        this.setQtdeCompradaItem(qtdeCompradaItem);
        this.setPrecoUnitarioItem(precoUnitarioItem);
    }
    
    public double getInvoiceAmount() {
        return (qtdeCompradaItem * precoUnitarioItem);
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtdeCompradaItem() {
        return qtdeCompradaItem;
    }

    public void setQtdeCompradaItem(int qtdeCompradaItem) {
        if (qtdeCompradaItem < 0) {
            this.qtdeCompradaItem = 0;            
        } else {
            this.qtdeCompradaItem = qtdeCompradaItem;
        }
    }

    public double getPrecoUnitarioItem() {
        return precoUnitarioItem;
    }

    public void setPrecoUnitarioItem(double precoUnitarioItem) {
        if (precoUnitarioItem < 0) {
            this.precoUnitarioItem = 0.0d;
        } else {
            this.precoUnitarioItem = precoUnitarioItem;
        }
    }

    
    
    
    
}
