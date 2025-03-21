public class Main {
    public static void main(String[] args) {
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
        double tempCelsius = 32;
        int tempFahrenheit = (int)(tempCelsius * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit é: " +tempFahrenheit + "F");
    }
}