import java.util.Scanner;

public class StringsExercise {
    public static void main (String[] args){
        /*
        Get a line of string
        break down the string into two by the first space
         make the first string to uppercase
         */

        System.out.println("Input Two Words");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);

        /*
        The first paragraph is where the user inputs two words into the terminal, and the scanner scans the
        terminal for the two inputs.
         */

        int index = input.indexOf(" ");
        System.out.println("This is the location of the space: " + index);
        String firstString = input.substring(0,index);
        System.out.println("First String was capitalized: "+ firstString.toUpperCase());

        /*
        The second paragraph is where the first string scanned will be posted on the terminal in full
        capitals. The location of the space will also be posted.
         */

        String secondString = input.substring(index+1);
        System.out.println("Second String stays the same: " + secondString);






//
//        String RepulseBay = "Repulse Bay";
//        String Repulse = RepulseBay.substring(0,7);
//        String Bay = RepulseBay.substring(8);
//        System.out.println(Repulse.toUpperCase());
//        System.out.println(Bay);
    }
}
