public class FlipACoin
{
    public static void main(String args[])
    {
        //double num 1 or 2 
        double num = (Math.random() * 2) + 1;

        //convert num to int and check if is = to 1 
        if((int)num == 1)
        {
            //if one print heads
            System.out.println("heads");
        }
        else
        {
            //if anything else print tailss
            System.out.println("tails");
        }
    }


}