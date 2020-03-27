import java.util.ArrayList;
import java.util.Scanner;

public class GuessMyWordSelection{
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

            selectionSort(befArr);
            selectionSort(aftArr);

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

    public static void selectionSort(ArrayList<String> arr){
        for(int i = 0; i < arr.size() - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.size(); j++){
                String a = arr.get(j);
                if(a.compareTo(arr.get(minIndex)) < 0){
                    minIndex = j;
                }
            }
            String temp = arr.get(minIndex); 
            arr.set(minIndex, arr.get(i)); 
            arr.set(i, temp); 
            
        }
    }
}