import java.util.Scanner;

public class Circles {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number. That will be the radius, and we will find the perimeter and area for you.");
        double input = sc.nextDouble();

        System.out.println("Perimeter: "+2*input*Math.PI);
        System.out.println("Area: "+input*input*Math.PI);
    }

}
