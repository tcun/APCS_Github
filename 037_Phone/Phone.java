public class Phone {

    private boolean button;
    private String color;
    private double version;
    private String type;

    // Constructor method that intializes variables to avoid static
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
}