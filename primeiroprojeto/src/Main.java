public class Main {
    public static void main(String[] args) {
        //Principal
        /*
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int year = 2022;
        System.out.println("Ano de lançamento: " + year);
        float score = 8.2F;
        System.out.println("Nota do filme: " + score);
        String name = "Top Gun: Maverick";
        double avg = (9.8 + 7.7 + 8.6) / 3;
        int rating = (int) (avg/2);
        System.out.println(avg);
        System.out.println(rating);
        */
        //Atividades
        /* Atividades
        double tempCelsius = 32;
        int tempFahrenheit = (int)(tempCelsius * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit é: " +tempFahrenheit + "F"); */
        //Desafios
        double nota1 = 9.8;
        double nota2 = 7.6;
        double result = (nota1 + nota2) / 2;
        System.out.println(result);

        int resultInt = (int) result;
        System.out.println(resultInt);

        char caracter = '!';
        String sentence = "O dia esta chuvoso";
        System.out.println(sentence + caracter);

        double priceProduct = 349.99;
        int quantity= 8;
        System.out.println("O preco do produto e: " + priceProduct + " com " + quantity + " e o valor final e de " + (priceProduct * quantity));

        double valueInDollars = 150.50;
        double conversionForReal = valueInDollars * 5.76;
        System.out.println(conversionForReal);

        double priceOriginal = 550;
        double percentDiscount = 10;
        System.out.println((priceOriginal - (priceOriginal * (percentDiscount / 100))));

    }
}