public class SimpleCounter {

    public static void main(String args[]) {
        // for loop to count to 10
        for (int i = 0; i < 10; i++) {
            // prints the i int and stop printing when i reaches 10
            System.out.println(i + 1);
        }
        System.out.println();
        int c = 0;
        // while c is below 10, continues to run
        while (c < 10) {
            // running c + 1
            System.out.println(c + 1);
            // adding to c
            c++;
        }
    }

}