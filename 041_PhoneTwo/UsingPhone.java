public class UsingPhone {
    public static void main(String args[]) {
        // creates new phone object
        Phone p = new Phone("iPhone 99", 1.0, "Jet Black", true);
        Phone defaultPhone = new Phone();
        Phone colorPhone = new Phone("Red");

        System.out.println("Your Phone: " + p.getColor() + ", Version: " + p.getVersion() + ", What kind of Phone? " + p.getType()+ ", Is there a button? " + p.getButton());

        System.out.println("Standard Phone: " + defaultPhone.getColor() + ", Version: " + defaultPhone.getVersion() + ", What kind of Phone? " + defaultPhone.getType()+ ", Is there a button? " + defaultPhone.getButton());

        System.out.println("Colored Phone: " + colorPhone.getColor() + ", Version: " + colorPhone.getVersion() + ", What kind of Phone? " + colorPhone.getType()+ ", Is there a button? " + colorPhone.getButton());
    }
}