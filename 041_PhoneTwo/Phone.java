public class Phone {

    boolean button;
    String color;
    double version;
    String type;
    // Creating Three Constructors (Overloading!!!!)

    // Base Constructor for a default phone with predetermined values
    public Phone(){
        button = true;
        color = "Silver";
        version = 7.2;
        type = "iPhone 4";
    }

    // Constructor with only one parameter for changing color
    public Phone(String initColor) {
        color = initColor;
        button = true;
        version = 7.2;
        type = "iPhone 4";
    }

    // Custom Constructor method that intializes variables to avoid static
    public Phone(String initType, double initVersion, String initColor, boolean initButton) {
        button = initButton;
        color = initColor;
        version = initVersion;
        type = initType;
    }

    public static void main(String args[]) {
        // empty
    }

    // boolean to check if phone has a button
    public void isThereAButton() {
        if (button) {
            System.out.println("You have a good phone");
        } else {
            System.out.println("Bad phone get a better one");
        }
    }

    // prints information of object constructed
    public void update() {
        double newVersion = version + 1;
        System.out.println(version + " updated to " + newVersion);

    }

    public boolean getButton() {
        return button;
    }

    public String getColor() {
        return color;
    }

    public double getVersion() {
        return version;
    }

    public String getType() {
        return type;
    }

}