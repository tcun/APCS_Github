public class AHerdOfCats{
    public static void main(String args[]){
        // Intializing array
        Cat[] c = new Cat[3];


        // Creating objects and placing them into an array
        c[0] = new Cat("Siamese", 29, true);
        c[1] = new Cat("Dog", 97, true);
        c[2] = new Cat("Coalition", 534, false);

        run(c);
    }
    //Method to run the assignment
    public static void run(Cat[] c){
        //Print check
        System.out.println(c[0].getName() + ", " + c[1].getName() + ", and " + c[2].getName() + " are here");
        System.out.println("They weigh as follows " + c[0].getWeight() + ", " + c[1].getWeight() + ", and " + c[2].getWeight());
        System.out.println("Are they getting fed?" + c[0].getFishFeed() + ", " + c[1].getFishFeed() + ", and " + c[2].getFishFeed());
        // For each loop to set weight according to a boolean
        for(Cat x: c){
           if( x.getFishFeed()){
               x.setWeight(100);
           }
        }
        // Final print check
        System.out.println("They now weigh as follows " + c[0].getWeight() + ", " + c[1].getWeight() + ", and " + c[2].getWeight());
    }

}


