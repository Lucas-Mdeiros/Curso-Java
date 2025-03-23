import java.util.Random;
import java.util.Scanner;

public class Laco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        /*
        System.out.println("Avaliacoes do filme");
        double avgMovie = 0;

        for(int i = 0; i < 3; i++){
            System.out.println("Digite uma nota: ");
            double rating = sc.nextDouble();
            avgMovie += rating;
        }

        System.out.println("A media e:" + (avgMovie/3));
        */

        int numSecret = rd.nextInt(100);
        int cont = 1;
       boolean game = true;
        int num = 0;
        while(game){
            num = sc.nextInt();
            if(num != numSecret){
                if(num > numSecret){
                    System.out.println("Numero digitado maior que numero secreto");
                }
                if(num < numSecret){
                    System.out.println("Numero digitado menor que numero secreto");
                }
                cont++;
            }else{
                System.out.println("Parabens, voce acertou o numero secreto");
                break;
            }


        }
        System.out.println("Numero de tentativas ate acertar " + cont);




    }
}
