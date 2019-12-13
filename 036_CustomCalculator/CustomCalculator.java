import java.util.Scanner;

public class CustomCalculator {
    public static double a;
    public static double b;
    public static double c;
    public static double d;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        
        
        System.out.println("Do you want to add, subtract, multiply, divide, use pythagorean theorem (type pyth), quadratic forumla (type quad), multiplying two binomials, EX: (a+2)(a+5) (type tri), or find perimeter (type perimeter).");
        String what = scan.next();

        if (what.equals("add")) {
            scanTwo();
            add(a, b);
        } else if (what.equals("subtract")) {
            scanTwo();
            subtract(a, b);
        } else if (what.equals("multiply")) {
            scanTwo();
            multiply(a, b);
        } else if (what.equals("divide")) {
            scanTwo();
            divide(a, b);
        } else if (what.equals("pyth")) {
            scanTwo();
            pythTheory(a, b);
        } else if (what.equals("quad")) {
            scanThree();
            quadraticForm(a, b, c);
        } else if (what.equals("tri")) {
            scanFour();
            squareTri(a, b, c, d);
        } else if (what.equals("perimeter")) {
            scanTwo();
            perimeter(a, b);
        } else{
            
        }
        
    }

    public static void add(double x, double y) {
        System.out.println(x + y);

    }

    public static void subtract(double x, double y) {
        System.out.println(x - y);

    }

    public static void multiply(double  x, double  y) {
        System.out.println(x * y);

    }

    public static void divide(double x, double y) {
        System.out.println(x / y);

    }

    public static void pythTheory(double x, double y) {
        System.out.println(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));

    }

    public static void quadraticForm(double x, double y, double z){
        double posValue = (y + Math.sqrt(Math.pow(y, 2) - (4 * x * z)))/(2*x);
        double negValue = (y - Math.sqrt(Math.pow(y, 2) - (4 * x * z)))/(2*x);
        System.out.println(posValue + " & " + negValue);

    }

    public static void squareTri(double x, double y, double z, double w) {
        System.out.println(x * z + "x^2 + " + (x * w) + (y * z) + "x + " + (y * w));

    }
    public static void perimeter(double x, double y) {
        System.out.println((a * 2) + (b*2));

    }

    public static void scanTwo() {
        System.out.println("Type in one number: ");
        a = scan.nextInt();
        System.out.println("Type in another number: ");
        b = scan.nextInt();
    }

    public static void scanThree() {
        System.out.println("Type in one number: ");
        a = scan.nextInt();
        System.out.println("Type in another number: ");
        b = scan.nextInt();
        System.out.println("Type in another number: ");
        c = scan.nextInt();
    }

    public static void scanFour() {
        System.out.println("Type in one number: ");
        a = scan.nextInt();
        System.out.println("Type in another number: ");
        b = scan.nextInt();
        System.out.println("Type in another number: ");
        c = scan.nextInt();
        System.out.println("Type in another number: ");
        d = scan.nextInt();
    }

}