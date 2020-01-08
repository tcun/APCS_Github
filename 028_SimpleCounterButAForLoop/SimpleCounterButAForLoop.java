public class SimpleCounterButAForLoop {

    public static void main(String args[]) {
        // literally the same code because i did it both ways the first time
        for (int i = 0; i < 301; i++) {
            System.out.println(i + 1);
        }

        for (int i = 300; i > -1; i--) {
            System.out.println(i);
        }

        for (int i = 4798; i < 5325; i++) {
            System.out.println(i);
        }

        for (int i = 5324; i > 4797; i--) {
            System.out.println(i);
        }
    }
}