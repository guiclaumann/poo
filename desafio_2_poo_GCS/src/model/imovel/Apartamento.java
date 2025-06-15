package model.imovel;

import model.pessoa.Proprietario;

public class Apartamento extends Imovel {
    private double valorCondominio;
    private double fundoReserva;
    private double investimentos;

    public Apartamento(String endereco, double valorAluguel, Proprietario proprietario, 
                      double valorCondominio, double fundoReserva, double investimentos) {
        super(endereco, valorAluguel, proprietario);
        this.valorCondominio = valorCondominio;
        this.fundoReserva = fundoReserva;
        this.investimentos = investimentos;
    }

    @Override
    public double calcularAluguel() {
        return getValorAluguel() + valorCondominio - fundoReserva - investimentos;
    }

    // Getters e Setters
    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public double getFundoReserva() {
        return fundoReserva;
    }

    public void setFundoReserva(double fundoReserva) {
        this.fundoReserva = fundoReserva;
    }

    public double getInvestimentos() {
        return investimentos;
    }

    public void setInvestimentos(double investimentos) {
        this.investimentos = investimentos;
    }
}