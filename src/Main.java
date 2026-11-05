import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador jogador = null;


        System.out.println("+--+ ARENA MANAGER +--+");
        jogador = cadastrarJogador(sc);
        System.out.println("Jogador Cadastrado!");

       // double partidas = vitorias + derrotas;
       // double aproveitamento = vitorias * 100.0 / partidas;
        // System.out.println();
       // System.out.println("+--+--+--+ FICHA DO JOGADOR +--+--+--+");
       // System.out.println("Nome do jogador :" + nome);
       // System.out.println("Nick: " + nick);
       // System.out.println("Idade: " + idade);
       // System.out.println("Jogo Favorito: " + jogoFavorito);
       // System.out.println("Nível: " + nivel);
       // System.out.println("Partidas: " + partidas);
       // System.out.println("Partidas: " + partidas + " (" + vitorias + " V / " + derrotas + " D)" );
        //System.out.println("Aproveitamento: " + aproveitamento + "%");
       // System.out.println("+--+--+--+--+--+--+--+--+--+--+--+--+-");
    }

    static Jogador cadastrarJogador(Scanner sc) {
        System.out.println("+--+ CADASTRO DE JOGADOR +--+");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu NickName: ");
        String nick = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite seu jogo favorito: ");
        String jogoFavorito = sc.nextLine();
        System.out.print("Digite seu nível: ");
        int nivel = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o número de vitórias: ");
        int vitorias = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o número de derrotas: ");
        int derrotas = sc.nextInt();
        sc.nextLine();
        System.out.println("+--+--+--+--+--+--+--+--+--+--+--+--+--+-");
        System.out.println();

        return new Jogador(nome, nick, idade, jogoFavorito);
    }
}
