import java.util.ArrayList;

public class CleanTempSensorData{
    public static void main(String args[]){
        SensorData s = new SensorData();

        ArrayList<Integer> nice = cleanData(s.getTempSensorData());

        for(int x : nice)
        System.out.println(x);
    }

    public static ArrayList cleanData(int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 15){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}