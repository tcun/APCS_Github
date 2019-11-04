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
        // setting rock, paper, scissors objects to have value
        rock = new String("rock");
        paper = new String("paper");
        scissors = new String("scissors");
        // calling game function
        game();
    }

    public static String compPlay() {
        // setting compChoice to random int from 1-3
        double compChoice = Math.random() * 3 + 1;

        // assigns 1-3 to have string options
        if ((int) compChoice == 1) {
            return rock;
        } else if ((int) compChoice == 2) {
            return paper;
        } else if ((int) compChoice == 3) {
            return scissors;
        } else {
            return null;
        }
    }

    public static void game() {
        // setting scanner
        scan = new Scanner(System.in);

        System.out.println("Rock, Paper, or Scissors (type close if want to quit)");
        // scanning the next line
        userChoice = scan.next();
        // making userChoice lowercase
        userChoice = userChoice.toLowerCase();
        userChoiceLow = userChoice.trim();
        // setting a variable to a instance of comPlay
        compGameChoice = compPlay();

        // all the options for the choices
        if (compGameChoice.equals(scissors) && userChoiceLow.equals(paper)) {
            System.out.println("The computer chose " + compGameChoice + "!");
            System.out.println("Computer Wins!");
            game();
        } else if (compGameChoice.equals(rock) && userChoiceLow.equals(scissors)) {
            System.out.println("The computer chose " + compGameChoice + "!");
            System.out.println("Computer Wins!");
            game();
        } else if (compGameChoice.equals(paper) && userChoiceLow.equals(rock)) {
            System.out.println("The computer chose " + compGameChoice + "!");
            System.out.println("Computer Wins!");
            game();
        } else if (compGameChoice.equals(paper) && userChoiceLow.equals(rock)) {
            System.out.println("The computer chose " + compGameChoice + "!");
            System.out.println("You win!");
            game();
        } else if (compGameChoice.equals(scissors) && userChoiceLow.equals(rock)) {
            System.out.println("The computer chose " + compGameChoice + "!");
            System.out.println("You Win!");
            game();
        } else if (compGameChoice.equals(rock) && userChoiceLow.equals(paper)) {
            System.out.println("The computer chose " + compGameChoice + "!");
            System.out.println("You Win!");
            game();
        } else if (compGameChoice.equals(paper) && userChoiceLow.equals(rock)) {
            System.out.println("The computer chose " + compGameChoice + "!");
            System.out.println("You Win!");
            game();
        } else if (compGameChoice.equals(paper) && userChoiceLow.equals(paper)) {
            System.out.println("The computer chose " + compGameChoice + "!");
            System.out.println("You tie!");
            game();
        } else if (compGameChoice.equals(rock) && userChoiceLow.equals(rock)) {
            System.out.println("The computer chose " + compGameChoice + "!");
            System.out.println("You tie!");
            game();
        } else if (compGameChoice.equals(scissors) && userChoiceLow.equals(scissors)) {
            System.out.println("The computer chose " + compGameChoice + "!");
            System.out.println("You tie!");
            game();
        } else if (userChoiceLow.equals("close")) {
            System.out.println("Ok bye");
            scan.close();
        } else {
            System.out.println("How can you not know how to play rock, paper, scissors?");
            game();
        }
    }
}