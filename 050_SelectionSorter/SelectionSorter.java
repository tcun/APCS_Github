public class SelectionSorter{
    public static void main(String args[]){
        UnsortedArrays u = new UnsortedArrays();
        int[] test = u.getArrOne();
        sortArray(test);

        System.out.println();
        for(int x : test){
            System.out.print(x + " ");
        }
        
    }

    public static void sortArray(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                
            }
            int temp = arr[minIndex]; 
            arr[minIndex] = arr[i]; 
            arr[i] = temp; 
            
        }
    }

}