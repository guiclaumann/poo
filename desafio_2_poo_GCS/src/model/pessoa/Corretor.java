package model.pessoa;

import interfaces.RecebeValor;

public class Corretor extends Pessoa implements RecebeValor {
    private String creci;
    private double totalComissaoAcumulada;

    public Corretor(String nome, String cpf, String rg, String telefone, String email, String creci) {
        super(nome, cpf, rg, telefone, email);
        this.creci = creci;
        this.totalComissaoAcumulada = 0;
    }

    @Override
    public void receber(double valor) {
        this.totalComissaoAcumulada += valor;
        System.out.printf("O corretor %s está recebendo o valor de R$%.2f%n", getNome(), valor);
    }

    public void sacarComissao(double valor) {
        if (valor <= totalComissaoAcumulada) {
            totalComissaoAcumulada -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    // Getters e Setters
    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }

    public double getTotalComissaoAcumulada() {
        return totalComissaoAcumulada;
    }
}