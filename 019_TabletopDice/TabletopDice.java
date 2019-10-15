public class TabletopDice
{
    public static void main(String args[])
    {
        //printing all methods
        System.out.println(fourDie());
        System.out.println(sixDie());
        System.out.println(eightDie());
        System.out.println(tenDie());
        System.out.println(twelveDie());
        System.out.println(twentyDie());
        System.out.println(percentile());
        System.out.println((int)percentileOftenDie());
    }
    //methods for each type of dice
    public static int fourDie()
    {
        //variable roll being set to random with a range of 1-4
        double roll = (Math.random()* 4 + 1);
        return (int)roll;
    }
    public static int sixDie()
    {
        //variable roll being set to random with a range of 1-6
        double roll = (Math.random()* 6 + 1);
        return (int)roll;
    }
    public static int eightDie()
    {
        //variable roll being set to random with a range of 1-8
        double roll = (Math.random()* 8 + 1);
        return (int)roll;
    }
    public static int tenDie()
    {
        //variable roll being set to random with a range of 1-10
        double roll = (Math.random()* 10 + 1);
        return (int)roll;
    }
    public static double percentile()
    {
        //variable roll being set to random with a range of 1-10
        double roll = (Math.random());
        return (double)roll;
    }
    public static int twelveDie()
    {
        //variable roll being set to random with a range of 1-12
        double roll = (Math.random()* 12 + 1);
        return (int)roll;
    }
    public static int twentyDie()
    {
        //variable roll being set to random with a range of 1-20
        double roll = (Math.random()* 20 + 1);
        return (int)roll;
    }
    public static double percentileOftenDie()
    {
        return percentile() * tenDie();
    }
}