public class MaximumIntegers
{
    public static void main(String args[])
    {
        //creating integer object but it's depricated so that's cool
        Integer num = new Integer(0);

        //setting variables to min and max
        int min = num.MIN_VALUE;
        int max = num.MAX_VALUE;

        //printing out min and max
        System.out.println(min);
        System.out.println(max);

        //print out underflows and overflows
        System.out.println(max + min + 1_000_001);
        System.out.println(min + max + 746);
    }
}