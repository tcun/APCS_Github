public class InsertionSorter{
    public static void main(String args[]){
        UnsortedArrays u = new UnsortedArrays();
        int[] test = u.getArrOne();
    // Prints original array
        for(int x : test){
            System.out.println(x + " ");
        }
    // Call insert method
        System.out.println("Sorted: ");
        insertSort(test);
    // Prints array after sort
        for(int x : test){
            System.out.println(x + " ");
        }
    }
    // void insertSort 
    public static void insertSort(int arr[]){
        // first loop to go through the entirety of the array
        for(int i = 1; i < arr.length; i++){
            // Grab current and make j for second loop
            int curr = arr[i];
            int j = i - 1; 
            // Second loop comparing current to all indexes to the right
            while(j >= 0 && arr[j] > curr){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // When done set curr to whatever index it is
            arr[j + 1] = curr;
        }
    }
}