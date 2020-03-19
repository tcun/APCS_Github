public class UsingPhone {
    public static void main(String args[]) {
        // creates new phone object
        Phone p = new Phone("My Phone", 1.0, "Jet Black", true);
        // runs methods from Phone.class
        p.isThereAButton();
        p.update();
    }
}