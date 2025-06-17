package matricula;

public class Matricula {
    private String nomeAluno;
    private String nomeDisciplina;
    private double primeiraNota;
    private double segundaNota;
    private double terceiraNota;

    public Matricula(String nomeAluno, String nomeDisciplina) {
        this.nomeAluno = nomeAluno;
        this.nomeDisciplina = nomeDisciplina;
        this.primeiraNota = 0.0;
        this.segundaNota = 0.0;
        this.terceiraNota = 0.0;
    }
    
    //getter
    public String getNomeAluno() { return nomeAluno; }
    public String getNomeDisciplina() { return nomeDisciplina; }
    public double getPrimeiraNota() { return primeiraNota; }
    public double getSegundaNota() { return segundaNota; }
    public double getTerceiraNota() { return terceiraNota; }

    //setter
    public void setPrimeiraNota(double nota) { 
    	this.primeiraNota = ajustarNota(nota); 
    	}
    
    public void setSegundaNota(double nota) { 
    	this.segundaNota = ajustarNota(nota); 
    	}
    
    public void setTerceiraNota(double nota) { 
    	this.terceiraNota = ajustarNota(nota); 
    	}

    //permitir somente entre 0 até 10
    private double ajustarNota(double nota) {
    	return nota < 0 ? 0.0 : nota > 10 ? 10.0 : nota;
    	}

    //calculadora de media
    public double calcularMediaSimples() {
    	return (primeiraNota + segundaNota + terceiraNota) / 3; 
    	}

    //imprimir Respostas (nome, materia, nota, media simples)
    public void imprimirDados() {
        System.out.println("\n=== DADOS DA MATRÍCULA ===");
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Disciplina: " + nomeDisciplina);
        System.out.println("Notas: " + primeiraNota + ", " + segundaNota + ", " + terceiraNota);
        System.out.printf("Média Simples: %.2f\n", calcularMediaSimples());
    }
}