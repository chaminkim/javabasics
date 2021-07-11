import java.util.Scanner;

public class InputMultiply {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println(("input a number, and we will multiply that number from 1 to 10"));
        int input = sc.nextInt();

        for (int i = 0; i<11; i++){
            System.out.println(i+"x"+input+"="+i*input);
        }


    }
}
