import java.util.*;

public class AverageOfDice{
    static ArrayList<Integer> cool = new ArrayList<Integer>();

    public static void main(String args[]){
        System.out.println(arrAverage(generateRandomArrayList(cool)));
    }

    public static Integer hundredSidedDie(){
        double k = Math.random() * 100 + 1;
        Integer wow = new Integer((int)k);
        return wow;
    }

    public static ArrayList generateRandomArrayList(ArrayList arr){
        for(int i = 0; i < 100; i++){
            arr.add(hundredSidedDie());
        }
        return arr;
    }

    public static int arrAverage(ArrayList arr){
        int total = 0;
        for(int i = 0; i < arr.size(); i++){
            total += (int)arr.get(i);
        }
        return total / arr.size();
    }
}