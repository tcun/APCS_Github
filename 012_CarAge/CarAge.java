
public class CarAge
{
    public static void main(String args[])
    {

        //Creating 5 car objects
        Car defaultCar = new Car();
        Car car1 = new Car(2004, 175_000, "Ford", "F150 Supercrew 4x4", false);
        Car car2 = new Car(2013, 70_000, "Mazda", "Sedan", false);
        Car car3 = new Car(1997, 161_000, "Pontiac", "Grand Prix GT", false);
        Car car4 = new Car(2003, 152_000, "Ford", "Explorer Sport", false);

        //running getAge methods
        getAge(defaultCar.year);
        getAge(car1.year);
        getAge(car2.year);
        getAge(car3.year);
        getAge(car4.year);
    }
    //method of formulate car age
    public static void getAge(int carYear)
    {
        //subtract the car year from 2019 to grab years old
        carYear -= 2019;
        //get rid of pesky negative sign
        carYear *= -1;
        System.out.println(carYear + " Years Old");
    }
}