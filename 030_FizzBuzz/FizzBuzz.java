import java.util.Scanner;

public class FizzBuzz {
    public static int x;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What number do you want to count to?");
        x = scan.nextInt();
        scan.close();
        //for loop that counts words but has an if statement to check fizz buzz
        for (int i = 1; i < x + 1; i++) {
            System.out.println("You are at " + i);
            //if the number can be divided by 3 and 5 print fizz buzz, if only can be divided by three print fizz, if only can be divided by 5 print buzz
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