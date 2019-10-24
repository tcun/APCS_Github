import java.util.InputMismatchException;
import java.util.Scanner;

public class IsItLegalForYou
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num;
        //intro and asking for input through scanner
        System.out.println("Can you get a Driver's licence, buy cigarettes, go to a casino, or rent a car?");
        System.out.println("Input your age:");
        num = scan.nextInt();
        
        //if below 17 just get out no childs allowed
        if(num =< 17)
        {
            System.out.println("Begone child");
        }
        //if between 18 and 20, you do everything but buy alcohol and rent a car
        else if(num >= 18 && num <= 20 )
        {
            System.out.println("You can drive, go to the casino, and buy cigarrettes (just not in Minneapolis), but you cannot buy alcohol or rent a car.");
        }
        //if between 21 and 24 they do everything but rent a car
        else if(num >= 21 && num <= 24 )
        {
            System.out.println("You can drive, go to the casino, buy alcohol, and buy cigarrettes anywhere, but you cannot rent a car.");
        }
        // else if(num != (int)num)
        // {
        //     throw new InputMismatchException("Don't be difficult");
        // }
        //if above  or equal to 25 you're all good 
        else
        {
            System.out.println("You can do it all baby, you are a fully-fledged adult");
        }
        scan.close();
    }
}