import java.util.Scanner;

public class Desafios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Digite um numero: ");
        int number = sc.nextInt();

        if(number >= 0 ){
            System.out.println("Numero positivo");
        }
        else{
            System.out.println("Numero negativo");
        }

        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Os numeros são iguais.");
        }else if(num1 > num2){
            System.out.println(num1 + " é maior do que " + num2);
        }else{
            System.out.println(num2 + " é maior do que " + num1);
        }
        */
        System.out.println("Escolha uma opção" +
                "\n1- Calcular area do quadrado" +
                "\n2- Calcular area do circulo");
        int num = sc.nextInt();
        switch (num){
            case 2:
                System.out.println("Digite o raio do circulo");
                double radius = sc.nextDouble();
                double areaCircle = 3.14159265358979323846 * Math.pow(radius, 2);
                System.out.println("A area do circulo é " + areaCircle);
                break;
            case 1:
                System.out.println("Digite o lado do quadrado");
                double side = sc.nextDouble();
                System.out.println("A area do quadrado é: " + (side * side));
                break;
        }



    }
}
