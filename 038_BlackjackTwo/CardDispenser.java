import java.util.Scanner;

public class CardDispenser{
    private int card1;
    private int total;
    private int card2;
    private int card3;
    private int dealerCard1;
    private int dealerCard2;
    private int dealerTotal = 0;
    private Scanner scan = new Scanner(System.in);
    private boolean wow = true;
    private String lCheck;
    private String hit;
    private String stay = "stay";

    // public boolean test;

    public CardDispenser(){
    }
    public static void main(String args[]){

    }

    public void run(){
        beginGame();

        while(wow){
        stayCheck();
        checkWin();
        }
    }

    public void beginGame(){
        
        card1 = generateCard();
        card2 = generateCard();

        System.out.println("You received a " + card1 + " and " + card2);
        total = card1 + card2; 
        System.out.println("Your total is " + total);

        dealerCard1 = generateCard();
        System.out.println("The dealer was dealt " + dealerCard1);
        dealerTotal += dealerCard1;
    }

    public int generateCard(){
        double num = Math.random() * 10 + 1;
        return (int) num;
    }

    public void stayCheck(){
        hit = "hit";
        System.out.println("Hit or Stay?");
        String check = scan.next();
        lCheck = check.toLowerCase();

        if (lCheck.equals(hit)) {

            // adds another card to total
            card3 = generateCard();
            System.out.println("You got a " + card3);
            total += card3;
            System.out.println("Your total is: " + total);
        }
        else {
            System.out.println("Coward");
            // isDone = false;
        }

        if(dealerTotal < 17)
        {
            dealerCard2 = generateCard();
            dealerTotal += dealerCard2;
            System.out.println("The dealer has " + dealerTotal);
        }
        else{
            System.out.println("The dealer has " + dealerTotal);
        }

    }
    public void checkWin()
    {
        if(total == 21){
            System.out.println("You win!");
            wow = false;
            scan.close();
        }
        if(dealerTotal == 21){
            System.out.println("You lose!");
            wow = false;
            scan.close();
        }
        else if(total > 21){
            System.out.println("You lose");
            wow = false;
            scan.close();
        }
        else if(dealerTotal > 17 && total < dealerTotal && lCheck.equals(stay)){
            System.out.println("You lose");
            wow = false;
            scan.close();
        }
        else if(dealerTotal > 17 && total > dealerTotal && lCheck.equals(stay)){
            System.out.println("You win!");
            wow = false;
        }
        else{
            System.out.println("Next Round!");
        }
    }
}