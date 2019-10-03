import java.util.Scanner;

public class LoanCalculator {

    public static int monthlyInterest;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Principal Balance: ");
        int prinBal = scan.nextInt();
        System.out.println("Enter Annual Interest Rate Balance: ");
        int  annualIntRate = scan.nextInt();
        System.out.println("Enter Reamining Months Balance: ");
        int remainMonths = scan.nextInt();
        scan.close();

        int blah = calcMonthlyInterest(prinBal, annualIntRate, remainMonths);
        int boop = calcMonthlyPayment(prinBal, monthlyInterest, remainMonths);

        System.out.println("Monthly Interest: " + blah);
        System.out.println("Monthly Payment: " + boop);

    }

    public static int calcMonthlyInterest(int principalBalance, int annualInterestRate, int remainingMonths) {
         monthlyInterest = principalBalance * (annualInterestRate/remainingMonths);
        return monthlyInterest;
    }

    public static int calcMonthlyPayment(int principalBalance, int monthlyInterest, int remainingMonths) {
        int monthlyPayment = principalBalance/remainingMonths + monthlyInterest;
        return monthlyPayment;
    }
}