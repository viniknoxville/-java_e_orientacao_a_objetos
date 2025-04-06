import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        //objeto 0
        Filme meuFilme = new Filme();

        meuFilme.nome = "Star Wars: Episódio V - O império Contra Ataca";
        meuFilme.anoDeLancamento = 1980;
        meuFilme.duracaoEmMinutos = 124;

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
    }
}


