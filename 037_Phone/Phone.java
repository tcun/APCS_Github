public class Phone {

    public boolean button;
    public String color;
    public double version;
    public String type;

    public Phone(String initType, double initVersion, String initColor, boolean initButton) {
        button = initButton;
        color = initColor;
        version = initVersion;
        type = initType;
    }
    public static void main(String args[]) {
        //empty
    }
    public void isThereAButton() {
        if (button) {
            System.out.println("You have a good phone");
        } else {
            System.out.println("Bad phone get a better one");
        }
    }
    public void update() {
        double newVersion = version + 1;
        System.out.println(version + " updated to " + newVersion);

    }
}