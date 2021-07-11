import java.util.Scanner;

public class Homework {
    public static void main (String[] args){
        /*
        Get an input of strings and make all the "a" into "A"

        Sample Input and Output:
       Input: Hello my name is Bobby. I have a Macbook Pro.
       Output: Hello my nAme is Bobby. I hAve A MAcbook Pro.
         */

        //1. Get the scanner ready

        System.out.println("Input a sentence");
        Scanner sc = new Scanner(System.in);


        //2. Make the scanner read the input.scanner.nextLine()

        String input = sc.nextLine();

        //3. input.replaceAll("a","A");

        String output = input.replaceAll("a","A");


        //4. print the modified string.

        System.out.println("The code made the lowercase 'a' to uppercase");
        System.out.println(output);

    }
}
