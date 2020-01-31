public class AverageDiceRoll{

    public static void main(String[] args){
        //initiailizing class with array
        OneThousandDiceRolls one = new OneThousandDiceRolls();
        System.out.println(findAverage(one.getDiceRolls()));
    }
    //creating method with array parameter
    public static int findAverage(int[] y){
        int total = 0;
        //looping all index points in array and adding them together
        for(int i = 0; i < y.length; i++){
            total += y[i];
        }
        return total / y.length; 
    }
}