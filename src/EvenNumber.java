import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

//        This code gets an integer inputted in the terminal, and determines whether it is an even or odd number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer");
        int input = sc.nextInt();

        if (input % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
