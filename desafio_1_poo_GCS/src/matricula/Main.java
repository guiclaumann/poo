//Guilherme Claumann Silva senai - ADS



package matricula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        //primeiro dialogo 
        System.out.println("=== SISTEMA DE GESTÃO DE NOTAS ===");
        
        // entrada de cadastro
        System.out.print("\nNome do aluno: ");
        String nomeAluno = scanner.nextLine();
        
        System.out.print("Nome da disciplina: ");
        String nomeDisciplina = scanner.nextLine();
        
        //chamando o construtor
        Matricula matricula = new Matricula(nomeAluno, nomeDisciplina);
        
        // Entrada de notas
        System.out.print("\nPrimeira nota: ");
        matricula.setPrimeiraNota(scanner.nextDouble());
        
        System.out.print("Segunda nota: ");
        matricula.setSegundaNota(scanner.nextDouble());
        
        System.out.print("Terceira nota: ");
        matricula.setTerceiraNota(scanner.nextDouble());
        
        // Exibir resultados (puxa a informação dos dados)
        matricula.imprimirDados();
        
        scanner.close();
    }
}