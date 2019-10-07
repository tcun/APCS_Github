public class MaximumIntegers
{
    public static void main(String args[])
    {
        Integer num = new Integer(0);

        int min = num.MIN_VALUE;
        int max = num.MAX_VALUE;

        System.out.println(min);
        System.out.println(max);

        System.out.println(max + min + 1_000_001);
        System.out.println(min + max + 746);
    }
}