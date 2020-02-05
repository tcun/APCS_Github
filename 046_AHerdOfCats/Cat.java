public class Cat{
    String name;
    double weight;
    boolean fishFeed;
    // Constructor
    public Cat(String initName, double initWeight, boolean initFishFeed){
        name = initName;
        weight = initWeight;
        fishFeed = initFishFeed;
    }
    public static void main(String args[]){
        
    // A whole bunch of accessor and mutator methods
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setFishFeed(boolean fishFeed){
        this.fishFeed = fishFeed;
    }

    public String getName(){
        return this.name;
    }
    public double getWeight(){
        return this.weight;
    }
    public boolean getFishFeed(){
        return this.fishFeed;
    }
}