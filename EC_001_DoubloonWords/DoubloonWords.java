import java.util.Scanner;


public class DoubloonWords {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a word: ");
        String input = scan.next();
        scan.close();
        boolean faux = true;
        int l = 0;
        int ll = 0;
        
        //running a loop according to the length minus one of the word
        for (int i = 0; i < input.length() - 1; i++) {
            faux = false;
            //setting a string according to the position from i
            String letterCheck = input.substring(i, i + 1);
            //If has 2 or less characters break and print invalid
            if(input.length() <= 2){
                System.out.println("Invalid word, need more characters");
                break;
            }
            //checking if the letter is equal to the next
            if (letterCheck.equals(input.substring(i + 1, i + 2))) {
                System.out.println("It is valid");
                break;
            } else {
                faux = true;
            }
        }
        //final check if faux is true then it is not a doubloon word
        if (faux) {
            System.out.println("Not a doubloon word");
        }

    }
}