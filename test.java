public class test{
  public static void main(String args[]){
    int[] c = new int[]{2,2,1,2,2,1,1,3,2,3,3,1,1,1,1,1};
    int total = 0;
    for(int x : c){
      total += x;
    }
    System.out.println(total);
  }
}
