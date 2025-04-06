// Classe
public class Filme {
    // atributo
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDeAvaliacoes;
    private int totalAvaliacoes;
    int duracaoEmMinutos;

    int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    // metodo
    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    // metodo
    void avalia(double nota) {
        somaDeAvaliacoes += nota;
        totalAvaliacoes++;
    }

    // metodo
    double pegaMedia() {
        return somaDeAvaliacoes / totalAvaliacoes;
    }


}

