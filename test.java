import java.util.ArrayList;
import java.util.Arrays;

public class test {
  
  public static void main(String args[]) {
    ArrayList<Integer> x = new ArrayList<Integer>(Arrays.asList(4,2,3,7,345,24,56,3,4,53,5,4,5678,65,2));  
    
    for(Integer y: x){
      System.out.println(y.intValue());
      }
    }
}