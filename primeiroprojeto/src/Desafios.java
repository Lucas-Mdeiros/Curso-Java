import java.util.Scanner;

public class Desafios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = sc.nextInt();

        if(number >= 0 ){
            System.out.println("Numero positivo");
        }
        else{
            System.out.println("Numero negativo");
        }



    }
}
