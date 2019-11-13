import java.util.Scanner;

public class FizzBuzz {
    // public static String yes;
    public static int x;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // yes = "yes";
        System.out.println("What number do you want to count to?");
        x = scan.nextInt();
        scan.close();

        for (int i = 1; i < x + 1; i++) {
            System.out.println("You are at " + i);

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");

                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
        
        }
    }
}