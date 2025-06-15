//Guilherme Claumann Silva 
//main test

package main;

import model.imovel.Apartamento;
import model.imovel.Casa;
import model.pessoa.Corretor;
import model.pessoa.Locatario;
import model.pessoa.Proprietario;
import model.Locacao;

public class Main {
    public static void main(String[] args) {
        // Criando pessoas
        Proprietario proprietario1 = new Proprietario(
            "João Silva", "123.456.789-00", "MG-1234567", 
            "(31) 99999-9999", "joao@email.com", "joao.silva@pix"
        );
        
        Proprietario proprietario2 = new Proprietario(
            "Maria Souza", "987.654.321-00", "MG-7654321", 
            "(31) 98888-8888", "maria@email.com", "maria.souza@pix"
        );
        
        Corretor corretor = new Corretor(
            "Carlos Mendes", "111.222.333-44", "MG-1122334", 
            "(31) 97777-7777", "carlos@imobiliaria.com", "CRECI-12345"
        );
        
        Locatario locatario1 = new Locatario(
            "Ana Oliveira", "555.666.777-88", "MG-5566778", 
            "(31) 96666-6666", "ana@email.com"
        );
        
        Locatario locatario2 = new Locatario(
            "Pedro Santos", "999.888.777-66", "MG-9988776", 
            "(31) 95555-5555", "pedro@email.com"
        );

        // Criando imóveis
        Casa casa1 = new Casa(
            "Rua das Flores, 123 - Bairro Jardim", 2500.00, proprietario1
        );
        
        Apartamento apartamento1 = new Apartamento(
            "Av. Brasil, 456 - Apt 302 - Centro", 1800.00, proprietario2,
            500.00, 100.00, 200.00
        );

        // Criando locações
        Locacao locacaoCasa = new Locacao(
            1, casa1, locatario1, corretor, proprietario1, 12, 0.10
        );
        
        Locacao locacaoApartamento = new Locacao(
            2, apartamento1, locatario2, corretor, proprietario2, 24, 0.08
        );

        // Testando funcionalidades
        
        System.out.println("\n=== TESTE DE CÁLCULO DE ALUGUEL ===");
        System.out.printf("Aluguel da casa: R$%.2f%n", casa1.calcularAluguel());
        System.out.printf("Aluguel do apartamento: R$%.2f%n", apartamento1.calcularAluguel());
        
        System.out.println("\n=== TESTE DE ENVIO DE COBRANÇA ===");
        locacaoCasa.enviarCobranca();
        locacaoApartamento.enviarCobranca();
        
        System.out.println("\n=== TESTE DE PAGAMENTO AO PROPRIETÁRIO E CORRETOR ===");
        locacaoCasa.pagarProprietario();
        locacaoApartamento.pagarProprietario();
        
        System.out.println("\n=== TESTE DE SAQUE DE COMISSÃO ===");
        System.out.printf("Comissão acumulada antes do saque: R$%.2f%n", corretor.getTotalComissaoAcumulada());
        corretor.sacarComissao(300.00);
        System.out.printf("Comissão acumulada após saque: R$%.2f%n", corretor.getTotalComissaoAcumulada());
    }
} 