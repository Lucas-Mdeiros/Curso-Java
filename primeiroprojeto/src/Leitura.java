import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome de seu filme favorito:");
        String name = sc.nextLine();
        System.out.println("Qual o ano de lancamento: ");
        int age = sc.nextInt();
        System.out.println("Filme favorito: " + name + " Lancado em: " + age);
    }
}
