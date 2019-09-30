
public class SweetGarage
{
    public static void main(String args[])
    {

        //Creating 5 car objects
        Car defaultCar = new Car();
        Car car1 = new Car(2004, 175_000, "Ford", "F150 Supercrew 4x4", false);
        Car car2 = new Car(2013, 70_000, "Mazda", "Sedan", false);
        Car car3 = new Car(1997, 161_000, "Pontiac", "Grand Prix GT", false);
        Car car4 = new Car(2003, 152_000, "Ford", "Explorer Sport", false);

        //Printing Car information into sentence
        System.out.println("Wow look a " + defaultCar.year + " " + defaultCar.modelName + " It says it has " + defaultCar.milesDriven + " miles." + " Does it have turbo?" + " " + defaultCar.hasTurbo + "." + " Cool.");
        System.out.println("Wow look a " + car1.year + " " + car1.modelName + " It says it has " + car1.milesDriven + " miles." + " Does it have turbo?" + " " + car1.hasTurbo + "." + " Cool.");
        System.out.println("Wow look a " + car2.year + " " + car2.modelName + " It says it has " + car2.milesDriven + " miles." + " Does it have turbo?" + " " + car2.hasTurbo + "." + " Cool.");
        System.out.println("Wow look a " + car3.year + " " + car3.modelName + " It says it has " + car3.milesDriven + " miles." + " Does it have turbo?" + " " + car3.hasTurbo + "." + " Cool.");
        System.out.println("Wow look a " + car4.year + " " + car4.modelName + " It says it has " + car4.milesDriven + " miles." + " Does it have turbo?" + " " + car4.hasTurbo + "." + " Cool.");

        //Running revEngine and checking if engageTurbo for car3 object
        car3.revEngine();
        car3.engageTurbo();
        //Why not
        System.out.println("Why not");
    }
}