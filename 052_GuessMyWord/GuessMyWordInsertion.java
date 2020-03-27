import java.util.ArrayList;
import java.util.Scanner;

public class GuessMyWordInsertion{
    static String input; 
    public static void main(String args[]){
        start("cat");
    }
    public static void start(String answer){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> befArr = new ArrayList<String>();
        ArrayList<String> aftArr = new ArrayList<String>();
        System.out.println("Input guess: ");
        while(input != answer){
            input = scan.nextLine();

            if(input.compareTo(answer) < 0){
                befArr.add(input);
            }
            else if(input.compareTo(answer) > 0){
                aftArr.add(input);
            }
            else{
                System.out.print("You did it");
                break;
            }

            reverseInsertSort(befArr);
            reverseInsertSort(aftArr);

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            for(String x : befArr){
                System.out.print(x + " \n");
            }
            System.out.println("\n Input guess: \n");
            for(String x : aftArr){
                System.out.print(x + " \n");
            }
        }
        if(input == answer){
            System.out.print("You did it");
        }
        scan.close();
    }
    public static void insertSort(ArrayList<String> str){
        for(int i = 1; i < str.size(); i++){
            String curr = str.get(i);
            int j = i - 1; 
            while(j >= 0 && curr.compareTo(str.get(j)) > 0){
 
                str.set(j + 1, str.get(j));
                j = j - 1;
            }
            str.set(j + 1, curr);
        }
    }

    public static void reverseInsertSort(ArrayList<String> str){
        for(int i = 1; i < str.size(); i++){
            String curr = str.get(i);
            int j = i - 1; 
            while(j >= 0 && curr.compareTo(str.get(j)) < 0){
 
                str.set(j + 1, str.get(j));
                j = j - 1;
            }
            str.set(j + 1, curr);
        }
    }
}