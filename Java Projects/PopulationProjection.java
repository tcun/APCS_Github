public class PopulationProjection
{
    public static int minInYear;
    public static int birthPerSec;
    public static int deathPerSec;
    public static int immigrantPerSec;
    public static int total1;
    public static int startingTotal;
    public static int endTotal;

    public static void main(String args[])
    {
        startingTotal = 312032486;
        popFormula();
        System.out.println("Year 1:" + endTotal);
        startingTotal = endTotal;
        popFormula();
        System.out.println("Year 2:" + endTotal);
        startingTotal = endTotal;
        popFormula();
        System.out.println("Year 3:" + endTotal);
        startingTotal = endTotal;
        popFormula();
        System.out.println("Year 4:" + endTotal);
        startingTotal = endTotal;
        popFormula();
        System.out.println("Year 5:" +endTotal);
    }

    public static void popFormula()
    {
        minInYear = 31536000;
        birthPerSec = 7;
        deathPerSec = 13;
        immigrantPerSec = 45;

        
        endTotal = startingTotal + (minInYear/birthPerSec  + minInYear/immigrantPerSec) - minInYear/deathPerSec;
    }
   
}


