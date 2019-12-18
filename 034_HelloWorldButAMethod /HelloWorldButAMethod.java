public class HelloWorldButAMethod
{
    public static void main(String args[]){
        hello("hello");
    }
    // creating a void type method with parameter x that prints the "Hello" + parameter
    public static void hello(String x){
        System.out.println("Hello " + x);
    }
}