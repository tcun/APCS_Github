public class test {
  public static boolean  isIsogram(String str) {
      String lowStr = str.toLowerCase();
      boolean isDone = true;
      
      for(int i = 0; i < lowStr.length() - 1; i++)
      {
        String s = lowStr.substring(i, i +1);
        String ss = lowStr.substring(i + 1, i + 2);
        if(s.equals(ss)){
             isDone = false;
        } 
      }
      return isDone;
  } 
}