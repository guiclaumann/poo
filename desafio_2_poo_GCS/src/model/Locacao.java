package model;

import model.imovel.Imovel;
import model.pessoa.Corretor;
import model.pessoa.Locatario;
import model.pessoa.Proprietario;

public class Locacao {
    private int id;
    private Imovel imovel;
    private Locatario locatario;
    private Corretor corretor;
    private Proprietario proprietario;
    private int prazoMeses;
    private double percentualComissao;

    public Locacao(int id, Imovel imovel, Locatario locatario, Corretor corretor, 
                  Proprietario proprietario, int prazoMeses, double percentualComissao) {
        this.id = id;
        this.imovel = imovel;
        this.locatario = locatario;
        this.corretor = corretor;
        this.proprietario = proprietario;
        this.prazoMeses = prazoMeses;
        this.percentualComissao = percentualComissao;
    }

    public void enviarCobranca() {
        double valorAluguel = imovel.calcularAluguel();
        System.out.printf("E-mail: %s%n", locatario.getEmail());
        System.out.printf("O valor referente ao seu aluguel neste mês foi de R$%.2f.%n", valorAluguel);
    }

    public void pagarProprietario() {
        double valorAluguel = imovel.calcularAluguel();
        double comissao = valorAluguel * percentualComissao;
        double valorLiquido = valorAluguel - comissao;
        
        proprietario.receber(valorLiquido);
        corretor.receber(comissao);
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }

    public void setPrazoMeses(int prazoMeses) {
        this.prazoMeses = prazoMeses;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}