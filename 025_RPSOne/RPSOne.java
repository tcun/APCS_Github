import java.util.Scanner;

public class RPSOne {
    public static String rock;
    public static String paper;
    public static String scissors;
    public static String userChoiceLow;
    public static String userChoice;
    public static String compGameChoice;
    public static Scanner scan;

    public static void main(String args[]) {
    //setting rock, paper, scissors objects to have value
        rock = "rock";
        paper = "paper";
        scissors = "scissors";
    //calling game function
        game();

    }

    public static String compPlay() {
        //setting compChoice to random int from 1-3
        double compChoice = Math.random() * 3 + 1;

        //assigns 1-3 to have string options
        if ((int) compChoice == 1) {
            return rock;
        } else if ((int) compChoice == 2) {
            return paper;
        } else {
            return scissors;
        }
    }

    public static void game() {
        //setting scanner
        scan = new Scanner(System.in);

        System.out.println("Rock, Paper, or Scissors");
        //scanning the next line
        userChoice = scan.next();
        //making userChoice lowercase 
        userChoiceLow = userChoice.toLowerCase();

        compGameChoice = compPlay();
        scan.close();

        System.out.println("The computer chose " + compGameChoice + "!");
        //all the options for the choices
        if (compGameChoice.equals(scissors) && userChoiceLow.equals(paper)) {
            System.out.println("Computer Wins!");
        } else if (compGameChoice.equals(rock) && userChoiceLow.equals(scissors)) {
            System.out.println("Computer Wins!");
        } else if (compGameChoice.equals(paper) && userChoiceLow.equals(rock)) {
            System.out.println("Computer Wins!");
        } else if (compGameChoice.equals(paper) && userChoiceLow.equals(rock)) {
            System.out.println("You win!");
        } else if (compGameChoice.equals(scissors) && userChoiceLow.equals(rock)) {
            System.out.println("You Win!");
        } else if (compGameChoice.equals(paper) && userChoiceLow.equals(rock)) {
            System.out.println("You Win!");
        } else {
            System.out.println("You tie!");
        }
    }
}