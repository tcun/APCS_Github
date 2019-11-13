import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ScrabbleCalculator {
    static final int MAX_CHAR = 256; 

    public static int[] letterScore = { 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 };
    public static int[] letterNum = { 9, 2, 2, 4, 12, 2, 3, 2, 9, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1 };

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a word: ");
        String word = scan.next();
        scan.close();


        Map<Character, Integer> lettersMap = new HashMap<>();
        Map<Character, Integer> lettersNumMap = new HashMap<>();
        String lettersCap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        for (int i = 0; i < lettersCap.length(); i++) {
            lettersMap.put(lettersCap.charAt(i), letterScore[i]);
            lettersMap.put(lettersCap.toLowerCase().charAt(i), letterScore[i]);
        }

        for (int i = 0; i < lettersCap.length(); i++) {
            lettersNumMap.put(lettersCap.charAt(i), letterNum[i]);
            lettersNumMap.put(lettersCap.toLowerCase().charAt(i), letterNum[i]);

        }

        

        int totalValue = 0;
        for (int i = 0; i < word.length(); i++) {

            totalValue += lettersMap.get(word.charAt(i));
            
        }

        int count[] = new int[MAX_CHAR]; 
  
        int len = word.length(); 
  
        
        for (int i = 0; i < len; i++) 
            count[word.charAt(i)]++; 
  
        char ch[] = new char[word.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = word.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
   
                if (word.charAt(i) == ch[j])  
                    find++;                 
            } 
            
             
                 if(count[word.charAt(i)] > lettersNumMap.get(word.charAt(i)))
                 {
                    i = len;
                    System.out.println("Not enough letters");
                 }   
                 else{
                    i = len;
                    System.out.println(word + "is worth " + totalValue);
                 }  
                
        } 

 
    }

    } 
