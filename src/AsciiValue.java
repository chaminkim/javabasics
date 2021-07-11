import java.util.Scanner;

public class AsciiValue {
    public static void main (String[] args){

        System.out.println("Input a character, we will convert it to Ascii code for you");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char input2 = input.charAt(0);
        int ascii = input2;
        System.out.println(input2+"="+ascii);



    }
}
