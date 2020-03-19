public class FoodItem {
    // list of class specific variables
    private int foodAmount;
    private boolean isExpired;
    private String brand;
    private boolean isDamaged;

    public FoodItem() {
    }


    // four mutator methods that allows to set the value of their variable
    public void setFoodAmount(int initFoodAmount) {
        foodAmount = initFoodAmount;
    }

    public void setIsExpired(boolean initIsExpired) {
        isExpired = initIsExpired;
    }

    public void setBrand(String initBrand) {
        brand = initBrand;
    }

    public void setIsDamaged(boolean initIsDamaged) {
        isDamaged = initIsDamaged;
    }

    // four accessor methods that get their variable
    public int getFoodAmount() {
        return foodAmount;
    }

    public boolean getIsExpired() {
        return isExpired;
    }

    public String getBrand() {
        return brand;
    }

    public boolean getIsDamaged() {
        return isDamaged;
    }

    // primary run method that sets all mutators and then prints all accessors
    // also a loop test that prints changes in the accessor function
    public void run() {
        int am = 6;
        String b = "Kellogs";
        setBrand(b);
        setFoodAmount(am);
        setIsExpired(false);
        setIsDamaged(true);

        System.out.println("Frosted Flakes");
        System.out.println("Amount: " + getFoodAmount() + " oz " + " Brand: " + getBrand() + " Is it Expired? "
                + getIsExpired() + " Is it Damaged? " + getIsDamaged());

        for (int i = 1; i < getFoodAmount(); i++) {
            int newTotal = getFoodAmount() - i;
            System.out.println("I have eaten " + i + " oz");
            System.out.println("Your total amount is " + newTotal + " oz");
        }
    }
}