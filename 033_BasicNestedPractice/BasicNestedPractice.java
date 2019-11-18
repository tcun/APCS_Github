import java.util.Scanner;

public class BasicNestedPractice {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input a number 1 - 20");
        int row = scan.nextInt();

        System.out.println("Please input a number 1 - 20");
        int column = scan.nextInt();

        System.out.println("Please input ONLY one character");
        String x = scan.next();
        scan.close();

        for (int i = 1; i <= row; i++) {
            if (row > 20 || column > 20 || x.length() > 1) {
                break;
            }
            for (int j = 1; j <= column; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}