public class Jogador {
    String nome;
    String nick;
    int idade;
    String jogoFavorito;
    int nivel;
    int vitorias;
    int derrotas;

    public Jogador(String nome, String nick, int idade, String jogoFavorito) {
        this.nome = nome;
        this.nick = nick;
        this.idade = idade;
        this.jogoFavorito = jogoFavorito;
        this.nivel = 1;
        this.vitorias = 0;
        this.derrotas = 0;

    }


}