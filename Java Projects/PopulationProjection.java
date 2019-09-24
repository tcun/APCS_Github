public class PopulationProjection
{
    //established public ints for the total
    public static int secInYear;
    public static int birthPerSec;
    public static int deathPerSec;
    public static int immigrantPerSec;
    public static int total1;
    public static int startingTotal;
    public static int endTotal;

    //running main methods that runs all other methods
    public static void main(String args[])
    {
        //sets the starting total, then runs popFormula, then prints the endtotal
        startingTotal = 312032486;
        popFormula();
        System.out.println("Year 1:" + endTotal);
        //grab endTotal from previous calculation and sets it as startingTotal, calculates it and prints it
        startingTotal = endTotal;
        popFormula();
        System.out.println("Year 2:" + endTotal);
        //grab endTotal from previous calculation and sets it as startingTotal, calculates it and prints it
        startingTotal = endTotal;
        popFormula();
        System.out.println("Year 3:" + endTotal);
        //grab endTotal from previous calculation and sets it as startingTotal, calculates it and prints it
        startingTotal = endTotal;
        popFormula();
        System.out.println("Year 4:" + endTotal);
        //grab endTotal from previous calculation and sets it as startingTotal, calculates it and prints it
        startingTotal = endTotal;
        popFormula();
        System.out.println("Year 5:" +endTotal);
    }
    //population forumla for finding the total population changed based on various totals
    public static void popFormula()
    {
    //seconds in a year
        secInYear = 31536000;
    //births per second
        birthPerSec = 7;
    //deaths per second
        deathPerSec = 13;
    //immigrants per second
        immigrantPerSec = 45;

    //formula for finding total population change
    //BONUS: No they aren't exactly correct, since it's going to the nearest whole number, if I were to use doubles I would get decimals.
    //A more reliable number would be to set timers for each birth, immigrant, and death that affects the total. The timer time would scale down to be performed in a moment but equivalent to real time.
        endTotal = startingTotal + (secInYear/birthPerSec  + secInYear/immigrantPerSec) - secInYear/deathPerSec;
    }
   
}


