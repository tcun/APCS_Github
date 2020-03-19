import java.util.ArrayList;

public class CleanTempSensorData{
    public static void main(String args[]){
        SensorData s = new SensorData();

        ArrayList<Integer> nice = cleanData(s.getTempSensorData());

        for(int x : nice)
        System.out.println(x);
    }
    // Making function that scans an array and checks bad data then slaps them into an arraylist and returns it
    public static ArrayList cleanData(int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            // Checking inputs greater than 15 since those are the bad data points
            if(arr[i] < 15){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}