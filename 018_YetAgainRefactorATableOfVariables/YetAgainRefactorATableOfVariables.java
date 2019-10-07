import java.util.Scanner;
public class YetAgainRefactorATableOfVariables
{
    //default main method
   public static void main(String args[])
   {
        Scanner scan = new Scanner(System.in);
        //method printing out the numbers in table
        integerPrint();

        //scanner for the next line
        System.out.println("Enter custom int: ");
        int customVar = scan.nextInt();
        //method for custom 
        customIntegerPrint(customVar);
        scan.close();

   }

    //method being called in main
    public static void integerPrint()
    {
        int variable;

        variable = 1;
    //print variable table using math pow 
        System.out.println("a" + " " + "a^2" + " "  + "a^3");
        System.out.println(variable + "  " + Math.pow(variable,2)+ "  " + Math.pow(variable,2));
        System.out.println(variable*2 + "  " + Math.pow(variable*2,2)+ "  " + Math.pow(variable*2,2));
        System.out.println(variable*3 + "  " + Math.pow(variable*3,2) + "  " + Math.pow(variable*3,2));
        System.out.println(variable*4 + "  " + Math.pow(variable*4,2)+ " " + Math.pow(variable*4,2));
    }
    //method to fit parameter 
    public static void customIntegerPrint(int var)
    {
        System.out.println("a" + " " + "a^2" + " "  + "a^3");
        System.out.println(var + "  " + Math.pow(var,2)+ " " + Math.pow(var,2));
    }
// https://stackoverflow.com/questions/22084373/does-java-have-an-exponential-operator
// I was "inspired" by this code

//useless method now
    public static int squaredOperator(int n)
    {
        int nSquared;

        nSquared = n*n;
        return (nSquared);
    }
//another useless method
    public static int cubedOperator(int n)
    {
        int nCubed;

        nCubed = n*n*n;
        return (nCubed);
    }
}