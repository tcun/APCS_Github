import java.util.Scanner;

public class DateTranslator {
    public static void main(String args[]) {
        Scanner scan = new Scanner();

        System.out.println("Enter Day");
        String d = scan.next();

        System.out.println("Enter Month");
        String m = scan.next();

        System.out.println("Enter Year");
        String y = scan.next();

        System.out.println("American or European");
        String s = scan.next();

        if (s.equals("American"))
            dateA(m, d, y);
        else
            dateE(d, w, y);
    }

    public static void dateA(int day, int month, int year) {
        System.out.println("American Version: " + month + "/" + day + "/" + year);
    }

    public static void dateE(int day, int month, int year) {
        System.out.println("European Version: " + day + "/" + month + "/" + year);
    }
}