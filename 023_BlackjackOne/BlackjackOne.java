import java.util.Scanner;

public class BlackjackOne {
    public static int total;
    public static String check;
    public static String hit;
    public static boolean isDone = true;

    public static void main(String args[]) {
        hit = "hit";
        Scanner scan = new Scanner(System.in);
        // setting a random num to card1
        int card1 = deal();
        System.out.println("You got a " + card1);
        // setting a random num to card1
        int card2 = deal();
        System.out.println("You got a " + card2);
        // prints total of the two cards
        total = card1 + card2;
        System.out.println("Your total is: " + total);

        while (isDone) {
            // primary check to see if total is below 21
            if (total < 21) {
                // scanning next line for user response
                System.out.println("Hit or Stay?");
                check = scan.next();
                String lCheck = check.toLowerCase();
                // checking if the String check is equal to hit
                if (lCheck.equals(hit)) {

                    // adds another card to total
                    int card3 = deal();
                    System.out.println("You got a " + card3);
                    total += card3;
                    System.out.println("Your total is: " + total);
                }
                // if anything else it will end the game
                else {
                    scan.close();
                    System.out.println("Coward");
                    // isDone = false;
                }
            }
            // primary check to see if total is equal to 21
            else if (total == 21) {
                scan.close();
                System.out.println("You for sure won, even without an opponent!");
                isDone = false;
            }
            // if it's over 21 you lose
            else {
                scan.close();
                System.out.println("You automatically lose, RIP.");

                isDone = false;
            }

        }
    }

    // generates a number between 1-10
    public static int deal() {
        double num = Math.random() * 10 + 1;
        return (int) num;
    }

}