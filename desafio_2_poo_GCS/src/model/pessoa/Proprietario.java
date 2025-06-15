package model.pessoa;

import interfaces.RecebeValor;

public class Proprietario extends Pessoa implements RecebeValor {
    private String chavePix;

    public Proprietario(String nome, String cpf, String rg, String telefone, String email, String chavePix) {
        super(nome, cpf, rg, telefone, email);
        this.chavePix = chavePix;
    }

    @Override
    public void receber(double valor) {
        System.out.printf("O proprietário %s está recebendo o valor de R$%.2f%n", getNome(), valor);
    }

    // Getters e Setters
    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}