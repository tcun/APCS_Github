import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ScrabbleCalculator {
    // the max string can only be 256 letters
    static final int MAX_CHAR = 256;
    // creating two arrays with the with the scores and alotted number
    public static int[] letterScore = { 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4,
            10 };
    public static int[] letterNum = { 9, 2, 2, 4, 12, 2, 3, 2, 9, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1 };
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // scanning for a word
        System.out.println("Input a word: ");
        String word = scan.next();
        scan.close();
        // creating two hashmaps with characters, and integers
        Map<Character, Integer> lettersMap = new HashMap<>();
        Map<Character, Integer> lettersNumMap = new HashMap<>();
        String lettersCap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // loop that assigns the letter according to letterCap to a number in the
        // letterScore array, and slapping it into the hashmap
        for (int i = 0; i < lettersCap.length(); i++) {
            lettersMap.put(lettersCap.charAt(i), letterScore[i]);
            lettersMap.put(lettersCap.toLowerCase().charAt(i), letterScore[i]);
        }
        // loop that assigns the letter according to letterCap to a number in the
        // letterNum array, and slapping it into the hashmap
        for (int i = 0; i < lettersCap.length(); i++) {
            lettersNumMap.put(lettersCap.charAt(i), letterNum[i]);
            lettersNumMap.put(lettersCap.toLowerCase().charAt(i), letterNum[i]);
        }
        int totalValue = 0;
        // loop to add the total values according to the length and what the number is
        // in the letterMap for the score
        for (int i = 0; i < word.length(); i++) {
            totalValue += lettersMap.get(word.charAt(i));
        }
        // creating a count int array that can only be 256 characters
        int count[] = new int[MAX_CHAR];
        // taking the scan word and finding the length and assigning it to len
        int len = word.length();
        // taking the char according to i, and counting it
        for (int i = 0; i < len; i++)
            count[word.charAt(i)]++;
        // char array that as long as the length of the word
        char ch[] = new char[word.length()];
        // taking the char at i and checking if the count, and if it's less than the
        // number assigned to that char in the LetterNumMap hashmap
        for (int i = 0; i < len; i++) {
            ch[i] = word.charAt(i);

            if (count[word.charAt(i)] > lettersNumMap.get(word.charAt(i))) {
                i = len;
                System.out.println("Not enough letters");
            } else {
                i = len;
                System.out.println(word + " is worth " + totalValue);
            }
        }
    }
}