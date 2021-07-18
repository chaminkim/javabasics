public class Exercise50 {
    public static void main (String[] args) {

//      This exercise prints out all values between 0 and 100 that are divisible by 3, 5, and 15, respectively.

        System.out.println("Divisible by 3");

        for(int i=3; i<100; i+=3){

            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("Divisible by 5");

        for(int i=5; i<100; i+=5){
            System.out.print(i+", ");
        }

        System.out.println();
        System.out.println("Divisible by 15");

        for (int i=15; i<100; i+=15){
            System.out.print(i+", ");
        }
    }
}
