import java.util.Scanner;

public class NPlusNN {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int nn = input*11;
        int nnn = nn+input*100;
        int nnnn = input+nn+nnn;

        System.out.println(input + "+" + nn + "+" + nnn + "=" + nnnn);
    }
}
