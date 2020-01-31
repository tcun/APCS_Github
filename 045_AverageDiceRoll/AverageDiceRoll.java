public class AverageDiceRoll{

    public static void main(String[] args){
        //initiailizing class with array
        OneThousandPositiveOrNegativeInts one = new OneThousandPositiveOrNegativeInts();
        findAverage(one.getOneThousandPositiveOrNegativeInts());
    }
    //creating method with array parameter
    public static void findAverage(int[] y){
        int posTotal = 0;
        int negTotal = 0;
        //looping all index points in array and adding them together
        for(int i = 0; i < y.length; i++){
            //checking whether it's a negative number or positive number
            if(y[i] > 0){
                posTotal += y[i];
            }
            else{
                negTotal += y[i];
            }
        }
        System.out.println("Positives: " + posTotal);
        System.out.println("Negatives: " + negTotal);
    }
}