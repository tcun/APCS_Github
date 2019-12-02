import java.util.Scanner;

public class BasicNestedPractice {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);

        //scans for two numbers and then one character
        System.out.println("Please input a number 1 - 20");
        int row = scan.nextInt();

        System.out.println("Please input a number 1 - 20");
        int column = scan.nextInt();

        System.out.println("Please input ONLY one character");
        String x = scan.next();
        scan.close();

        //loop that runs as many times for a row
        for (int i = 1; i <= row; i++) {
            //check to see if it's below 20
            if (row > 20 || column > 20 || x.length() > 1) {
                break;
            }
            //nested loop that runs prescribed times, and then again because of the loop above it
            for (int j = 1; j <= column; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}