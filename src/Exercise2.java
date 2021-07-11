import java.util.Scanner;

/*
This program multiplies two numbers inputted by the user, and informs the user on whether or not
the product is greater than 100.
 */

public class Exercise2 {
    public static void main(String[] args) {

        System.out.println("Input any number");
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        System.out.println("Input another number");
        double input2 = sc.nextDouble();
        double product = input*input2;
        System.out.println("first number multiplied by the second number is " +product);

        if (product>100){
            System.out.println("Product is greater than 100");
        }
        else {
            System.out.println("Product is smaller than 100");
        }
    }
}
