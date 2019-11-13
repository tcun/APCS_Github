public class SimpleCounterButAForLoop {

    public static void main(String args[])
    {
        for(int i = 0; i < 10; i++){
        System.out.println(i + 1);
        }
        System.out.println();
        int c = 0;
        
        while(c < 10)
        {
            System.out.println(c + 1);
            c++;
        }
    }

}