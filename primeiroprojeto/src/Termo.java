import java.lang.reflect.Array;
import java.util.Scanner;

public class Termo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordSecret = "helio";
        boolean truFal = true;
        String word = "";
        char[] aList = new char[5];
        while(truFal){
            System.out.println("");
            System.out.println("Digite uma palavra: ");
            word = sc.nextLine();
            for(int i = 0; i < 5; i++){
                if(wordSecret.charAt(i) == word.charAt(i)){
                    aList[i]= word.charAt(i);
                }else{
                    aList[i] = '-';
                }
            }
            for(int i = 0; i < aList.length; i++) {
                System.out.print(aList[i]);
            }
            if(word.equals(wordSecret)){
                System.out.println("\n Voce acertou a palavra");
                break;
            }
        }
    }
}
