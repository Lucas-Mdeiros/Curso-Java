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
        System.out.println("Escolha uma dificuldade:" +
                "\n 1 - Facil(1 a 50) " +
                "\n 2 - Moderado(1 a 250)" +
                "\n 3 - Dificil(1 a 1000)");
        String difficult = sc.nextLine();
        int quantityNumbers = 0;
        switch (difficult){
            case "1":
                quantityNumbers = 50;
                break;
            case "2":
                quantityNumbers = 250;
                break;
            case "3":
                quantityNumbers = 1000;
                break;
        }
        int numSecret = rd.nextInt(quantityNumbers);
        int cont = 0;
       boolean game = true;
        int num = 1;
        while(game){
            num = sc.nextInt();
            cont++;
            if(num != numSecret){
                if(num > numSecret){
                    System.out.println("Numero digitado maior que numero secreto");
                }
                if(num < numSecret){
                    System.out.println("Numero digitado menor que numero secreto");
                }

            }else{
                System.out.println("Parabens, voce acertou o numero secreto");
                break;
            }


        }
        System.out.println("Numero de tentativas ate acertar " + cont);




    }
}
