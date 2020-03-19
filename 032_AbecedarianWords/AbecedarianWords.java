import java.util.Scanner;

public class AbecedarianWords {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a word:");
        String word = scan.next();
        scan.close();
        // setting a boolean equal the function wow and the parameters is the scanned
        // "word"
        boolean wow = isAbc(word);

        // if true it checks out if not it doesnt
        if (wow == true) {
            System.out.println(word + " is an abecedarian");
        } else {
            System.out.println(word + " is not an abecedarian");
        }
    }

    public static boolean isAbc(String s) {
        // if there is only one letter than it counts
        if (s.length() <= 1) {
            return true;
        }
        // first character to compare all the others one too
        char current = 'a';

        // for loop to run depending how long the string is
        for (int i = 0; i < s.length(); i++) {
            // if the current character is less than char at return false
            if (current > s.charAt(i)) {
                return false;
            }
            // if it doesnt return false then set the current to the charAt depending on 'i'
            // in the loop
            current = s.charAt(i);
        }
        // print true when done
        return true;
    }

}