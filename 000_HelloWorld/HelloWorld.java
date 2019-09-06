public class HelloWorld {

    public static String hello;
    public static double betterthanfloat;

    public static void main(String args[]) {
        hello = "HelloWorld";

        System.out.println(hello);
        nice();
        textArt();
    }


    public static void textArt() {
        System.out.println("░░░░░▄▄▀▀▀▀▀▀▀▀▀▄▄░░░░░");
        System.out.println("░░░░█░░░░░░░░░░░░░█░░░░");
        System.out.println("░░░░█░░░░░░░░░░░░░█░░░░");
        System.out.println("░░░█░░░░░░░░░░▄▄▄░░█░░░");
        System.out.println("░░░█░░▄▄▄░░▄░░███░░█░░░");
        System.out.println("░░░▄█░▄░░░▀▀▀░░░▄░█▄░░░");
        System.out.println("░░░█░░▀█▀█▀█▀█▀█▀░░█░░░");
        System.out.println("░░░▄██▄▄▀▀▀▀▀▀▀▄▄██▄░░░");
        System.out.println("░▄█░█▀▀█▀▀▀█▀▀▀█▀▀█░█▄░");
    }
}
