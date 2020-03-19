public class LinearSearch{
    public static void main(String args[]){
        OneThousandSortedRandomNumbers b = new OneThousandSortedRandomNumbers();

        int[] ar1 = linearSearch(7250, b.getSortedArray());
        System.out.println(Arrays.toString(ar1));
    }

    public int[] linearSearch(int target, int[] ar){
        int counter = 0;
        int answer = 0;

        for(int x: ar){
            if(x != target){
                counter++;
            }
            else{
                x = answer;
                break;
            }
        }
        return new int[] {target, counter};
    } 
}