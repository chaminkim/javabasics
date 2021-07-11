import java.util.Scanner;

public class FindAlphabet {
    public static void main (String[]args){

        //1. Activate Scanner

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //2. Convert to Aski code

        for (int a = 97; a<=122; a++) {
            char convert = (char) a;

            //3. Check index of each alphabet

            int output = input.indexOf(convert);
            System.out.println(output);
        }
    }

}
