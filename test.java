public class test {

    public static String sub;
    public static String subRev;
    public static String strRev;
    public static void main(String args[])
    {

        System.out.println(solution("cat"));
        whatever("cool");
    }

        public static String solution(String str) {
        String sub;
        String emp = "";
          for(int i = 0; i < str.length(); i++){
            sub = str.substring(i,i+1);
            emp = sub + emp;
          }
          return emp;
        }

        public static void whatever(String s){
          System.out.print
        }
      

}