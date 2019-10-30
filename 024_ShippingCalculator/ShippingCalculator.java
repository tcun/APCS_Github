import java.util.Scanner;

public class ShippingCalculator {
    public static double w;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input valid weight: ");
        //assign w to scan the next double input through terminal
        w = scan.nextDouble();
        //prints the check function
        System.out.println(check());
        scan.close();
    }

    //check function that returns a double when checking w input 

    public static double check() {
    
        if (0 < w && w < 1) {
            return 3.5;
        } else if (1 < w && w <= 3) {
            return 5.5;
        } else if (3 < w && w <= 10) {
            return 8.5;
        } else if (10 < w && w <= 20) {
            return 10.5;
        } else {
            System.out.println("Invalid Input");
            return 0;

        }
    }
}
