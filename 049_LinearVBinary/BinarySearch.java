import java.util.Arrays;

public class BinarySearch{
    public static void main(String args[]){
        OneThousandSortedRandomNumbers b = new OneThousandSortedRandomNumbers();

        int[] ar1 = binarySearch(7250, b.getSortedArray());
        System.out.println(ar1);
        
    }
    public static int[] binarySearch(int target, int[] ar){
        int right = ar.length - 1;
        int left = 0;
       
        int counter = 0;

        int[] answer = new int[2];

        while(left <= right){
            int midpoint = (left + right) / 2;

            if(target > arr[midpoint]){
                midpoint = right - 1;
            }
            else if(target < arr[midpoint]){
                midpoint = left + 1;
            }
            else{
                answer[0] = midpoint;
                answer[1] = counter;
                break;
            }
            counter++;
        }
        return answer;
    }
}