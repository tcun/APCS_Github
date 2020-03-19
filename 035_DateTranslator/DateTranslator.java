import java.util.Scanner;

public class DateTranslator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Day");
        int d = scan.nextInt();

        System.out.println("Enter Month");
        int m = scan.nextInt();

        System.out.println("Enter Year");
        int y = scan.nextInt();

        System.out.println("American or European");
        String s = scan.next();

        if (s.equals("American")) {
            dateA(m, d, y);
            scan.close();
        } else {
            dateE(d, m, y);
            scan.close();
        }

    }

    // creating two methods that take 3 parameters: the day, month, and year
    // depending on american or european version it rearranges to their designated
    // format
    public static void dateA(int day, int month, int year) {
        System.out.println("American Version: " + month + "/" + day + "/" + year);
    }

    public static void dateE(int day, int month, int year) {
        System.out.println("European Version: " + day + "/" + month + "/" + year);
    }
}