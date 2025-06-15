package model.imovel;

import model.pessoa.Proprietario;

public abstract class Imovel {
    protected String endereco;
    protected double valorAluguel;
    protected Proprietario proprietario;

    public Imovel(String endereco, double valorAluguel, Proprietario proprietario) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.proprietario = proprietario;
    }

    public abstract double calcularAluguel();

    // Getters e Setters
    public String getEndereco() {        
    	return endereco;
    }

    public void setEndereco(String endereco) {        
    	this.endereco = endereco;
    }

    public double getValorAluguel() {        
    	return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {        
    	this.valorAluguel = valorAluguel;
    }

    public Proprietario getProprietario() {        
    	return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {        
    	this.proprietario = proprietario;
    }
}