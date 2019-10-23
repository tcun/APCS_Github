import java.util.Scanner;
public class BlackjackOne
{
    public static int total;

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int card1 = deal();
        System.out.println("You got a " + card1);
        int card2 = deal();
        System.out.println("You got a " + card2);
        total = card1 + card2;
        System.out.println("Your total is: " + total);

        System.out.println("Hit or Stay?");
        String check = scan.next();

        if(total < 21)
        {
             if(check == "hit" || check == "Hit")
             {
                int card3 = deal();
                System.out.println("You got a" + card3);
                 total += card3;
                System.out.println("Your total is: " + total);
             }
            else
            {
                System.out.println("Well you don't have an opponent, so I don't know if you won.");
                scan.close();
            }
        
        }
    
        else if(total == 21)
        {
            System.out.println("You for sure won, even without an opponent!");
        }
        else
        {
            System.out.println("You automatically lose, RIP.");
        }
}
    public static int deal()
    {
        double num = Math.random() * 10 + 1;
        return (int)num;
    }
}