import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador j1 = new Jogador();

        System.out.println("Digite seu nome: ");
        j1.nome = sc.nextLine();
        System.out.println("Digite seu NickName: ");
        j1.nickname = sc.nextLine();
        System.out.println("Digite sua idade: ");
        j1.idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite seu jogo favorito: ");
        j1.jogoFavorito = sc.nextLine();
        System.out.println("Digite seu nível: ");
        j1.nivel = sc.nextInt();
        sc.nextLine();

        System.out.println("Nome do jogador:" + j1.nome
                + " Nick:" + j1.nickname
                + " Idade:" + j1.idade
                + " Jogo Favorito:" + j1.jogoFavorito
                + " Nível:" + j1.nivel);
    }
}
