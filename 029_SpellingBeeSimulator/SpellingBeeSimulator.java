import java.util.Scanner;

public class SpellingBeeSimulator {

    public static String dash;
    public static String emp;
    public static String bestAnswer;

    public static void main(String args[]) {
        System.out.println("Input a word: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        emp = "";
        
        System.out.println(wow(input));
        scan.close();
    }

    public static String wow(String in) {
        String answer = in.substring(0,1) + "-";
        for (int i = 1; i < in.length(); i++) {
            dash = "-";
            String nice = in.substring(i, i + 1);
            answer = answer + nice + "-";
        }
        int answerSub = answer.length() - 1;
        bestAnswer = answer.substring(0, answerSub);
        return bestAnswer;
    }
}