package Exercicio01POO;

import java.util.Date;

public class Pessoa {

    private String nome;
    private Date dataNascimento;
    private double altura;

    public String imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDataNascimento());
        System.out.println("Altura: " + getAltura());
        return null;
    }
    
    //public int calcularIdade() {
    //    
    //}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    

    
}
