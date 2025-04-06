package br.com.alura.screenmatch.modelos;

// Classe
public class Filme {
    // atributo
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDeAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }
    // metodo
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    // metodo
    public void avalia(double nota) {
        somaDeAvaliacoes += nota;
        totalAvaliacoes++;
    }
    // metodo
    public double pegaMedia() {
        return somaDeAvaliacoes / totalAvaliacoes;
    }


}

