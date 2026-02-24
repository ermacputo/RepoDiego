import java.util.Scanner;

public class calcularIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoAtual = 2026;

        System.out.println("Digite seu nome; ");
        String nome = sc.nextLine();

        System.out.println("Digite o ano de seu Nascimento; ");
        int anoNasc = sc.nextInt();

        int idade = anoAtual - anoNasc;


        System.out.println("Seu nome é " + nome + "!");
        System.out.println("Sua idade é " + idade + "!");

        sc.close();
    }
}