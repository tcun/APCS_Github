import java.util.*;

public class AverageOfDice{
    static ArrayList<Integer> cool = new ArrayList<Integer>();

    public static void main(String args[]){
        System.out.println(arrAverage(generateRandomArrayList(cool)));
    }

    // Generating an Integer that is 1-100
    public static Integer hundredSidedDie(){
        double k = Math.random() * 100 + 1;
        Integer wow = new Integer((int)k);
        return wow;
    }
    // Generates a random array with 100 indexes filled with random numbers
    public static ArrayList generateRandomArrayList(ArrayList arr){
        for(int i = 0; i < 100; i++){
            arr.add(hundredSidedDie());
        }
        return arr;
    }
    // Grabbing the average of that random array
    public static int arrAverage(ArrayList arr){
        int total = 0;
        for(int i = 0; i < arr.size(); i++){
            total += (int)arr.get(i);
        }
        return total / arr.size();
    }
}