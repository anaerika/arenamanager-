import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador j1 = new Jogador();

        System.out.println("+--+--+--+ CADASTRO DE JOGADOR +--+--+--+");
        System.out.print("Digite seu nome: ");
        j1.nome = sc.nextLine();
        System.out.print("Digite seu NickName: ");
        j1.nickname = sc.nextLine();
        System.out.print("Digite sua idade: ");
        j1.idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite seu jogo favorito: ");
        j1.jogoFavorito = sc.nextLine();
        System.out.print("Digite seu nível: ");
        j1.nivel = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o número de vitórias: ");
        j1.vitorias = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o número de derrotas: ");
        j1.derrotas = sc.nextInt();
        sc.nextLine();
        System.out.println("+--+--+--+--+--+--+--+--+--+--+--+--+--+-");
        System.out.println();

        int partidas = j1.vitorias + j1.derrotas;
        double aproveitamento = j1.vitorias * 100.0 / partidas;

        System.out.println();
        System.out.println("+--+--+--+ FICHA DO JOGADOR +--+--+--+");
        System.out.println("Nome do jogador :" + j1.nome);
        System.out.println("Nick: " + j1.nickname);
        System.out.println("Idade: " + j1.idade);
        System.out.println("Jogo Favorito: " + j1.jogoFavorito);
        System.out.println("Nível: " + j1.nivel);
        System.out.println("Partidas: " + partidas);
        System.out.println("Partidas: " + partidas + " (" + j1.vitorias + " V / " + j1.derrotas + " D)" );
        System.out.println("Aproveitamento: " + aproveitamento + "%");
        System.out.println("+--+--+--+--+--+--+--+--+--+--+--+--+-");
    }
}
