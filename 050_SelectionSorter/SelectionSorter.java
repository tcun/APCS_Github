public class SelectionSorter{
    public static void main(String args[]){
        UnsortedArrays u = new UnsortedArrays();
        int[] test = u.getArrOne();
        sortArray(test);
    // Printing the array
        System.out.println();
        for(int x : test){
            System.out.print(x + " ");
        }
        
    }
    // Method for sorting the array
    public static void sortArray(int[] arr){
        // Double loop to take one index and compare to everything in the array
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            // Goes through array again and compares index I 
            for(int j = i + 1; j < arr.length; j++){
                // Checking if index j is less than minIndex chosen by the first loop
                if(arr[j] < arr[minIndex]){
                    // If true, makes minIndex equal to j and continues through loop until finished with desired number that is less than
                    minIndex = j;
                }
                
            }
            // Makes a temp int, and then swaps the indexes 
            int temp = arr[minIndex]; 
            arr[minIndex] = arr[i]; 
            arr[i] = temp; 
            
        }
    }

}