import java.util.Scanner;
public class DoubloonWords{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a word: ");
        String input = scan.next();
        scan.close();
        
        for(int i = 0; i < input.length(); i++)
        {
            String letterCheck = input.substring(i, i+1);
            if(letterCheck.equals(input.substring(i+1, i+2))){
                System.out.println("It is valid");
                break;
            }
        }
    }
}