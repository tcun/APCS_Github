public class ComputeAnExpression
{
    public static void main(String[] args)
    {
        //old code
        // double total = ((9.5*4.5) - (2.5 * 3))/(45.5-3.5);

        //creating object
        ReturningCalculator calc = new ReturningCalculator();
        
        //math doubles that eventually turn into total through PEMDAS order
        double subPart1 = calc.doubleSubtractor(45.5,3.5);
        double multPart1 = calc.doubleMultiplier(9.5,4.5);
        double multPart2 = calc.doubleMultiplier(2.5, 3);
        double subPart2 = calc.doubleSubtractor(multPart1, multPart2);
        double total = calc.divider(subPart2, subPart1);

        //print total
        System.out.println(total);
    }
}