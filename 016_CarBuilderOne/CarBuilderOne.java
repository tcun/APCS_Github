import java.util.Scanner;

public class CarBuilderOne
{
    //variable declaration
    public static int carYear;
    public static int milage;
    public static String brand;
    public static String name;
    public static Boolean turbo;

    public static void main(String args[])
    {
        //declaring scanner object
        Scanner scan = new Scanner(System.in);

        //scanning inputs and setting them to variables
        System.out.println("Car Year: ");
        carYear = scan.nextInt();
        System.out.println("Milage: ");
        milage = scan.nextInt();
        System.out.println("Brand of car: ");
        brand = scan.nextLine();
        System.out.println("Name of car: ");
        name = scan.nextLine();
        System.out.println("Is it turbo (true or false): ");
        turbo = scan.nextBoolean();
        scan.close();

        //object declaration for custom car
        Car customCar = new Car(carYear, milage, brand, name, turbo);
        //print statement
        System.out.println("Wow look a " + customCar.year + " " + customCar.modelName + " It says it has " + customCar.milesDriven + " miles." + " Does it have turbo?" + " " + customCar.hasTurbo + "." + " Cool.");
        
    }

}