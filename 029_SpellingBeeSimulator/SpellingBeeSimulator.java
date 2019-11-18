import java.util.Scanner;

public class SpellingBeeSimulator {

    public static String dash;
    public static String emp;
    public static String bestAnswer;

    public static void main(String args[]) {
        // scanning user input
        System.out.println("Input a word: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        // setting emp to nothing
        emp = "";

        // running wow function because I am bad at naming methods
        System.out.println(wow(input));
        scan.close();
    }

    public static String wow(String in) {
        String answer = in.substring(0, 1) + "-";
        // running a for loop that takes the letter of the string according i and adds a dash
        for (int i = 1; i < in.length(); i++) {
            dash = "-";
            String nice = in.substring(i, i + 1);
            answer = answer + nice + "-";
        }
        // when it's done it gets rid of the final dash and reutrns the final answer
        int answerSub = answer.length() - 1;
        bestAnswer = answer.substring(0, answerSub);
        return bestAnswer;
    }
}