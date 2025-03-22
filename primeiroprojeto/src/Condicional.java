public class Condicional {
    public static void main(String[] args) {
        int age = 2001;
        boolean addInPlan = true;
        double rating = 8.1;
        String typePlan = "teste";

        if(age >= 2022){
            System.out.println("Filme lancamento que os clientes estao curtindo");
        }else{
            System.out.println("Filme retro");
        }

        if(addInPlan || typePlan.equals("plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("Deve pagar a locacao");
        }
    }
}
