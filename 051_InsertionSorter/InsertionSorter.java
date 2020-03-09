public class InsertionSorter{
    public static void main(String args[]){
        UnsortedArrays u = new UnsortedArrays();
        int[] test = u.getArrOne();

        for(int x : test){
            System.out.println(x + " ");
        }
        
        System.out.println("Sorted: ");
        insertSort(test);

        for(int x : test){
            System.out.println(x + " ");
        }
    }

    public static void insertSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int j = i - 1; 

            while(j >= 0 && arr[j] > curr){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = curr;
        }
    }
}