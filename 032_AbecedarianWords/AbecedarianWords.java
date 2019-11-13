import java.util.Scanner;

public class AbecedarianWords {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a word:");
        String word = scan.next();
        scan.close();
        boolean wow = isAbc(word);

        if (wow == true) {
            System.out.println(word + " is an abecedarian");
        } else {
            System.out.println(word + " is not an abecedarian");
        }
    }

    public static boolean isAbc(String s) {

        if (s.length() <= 1) {
            return true;
        }
        char current = 'a';

        for (int i = 0; i < s.length(); i++) {

            if (current > s.charAt(i)) {
                return false;
            }
            current = s.charAt(i);
        }
        return true;
    }

}