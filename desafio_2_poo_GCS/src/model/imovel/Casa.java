package model.imovel;

import model.pessoa.Proprietario;

public class Casa extends Imovel {
    public Casa(String endereco, double valorAluguel, Proprietario proprietario) {
        super(endereco, valorAluguel, proprietario);
    }

    @Override
    public double calcularAluguel() {
        return getValorAluguel();
    }
}