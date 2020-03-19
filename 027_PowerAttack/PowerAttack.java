import java.util.Scanner;

import sun.security.provider.certpath.ResponderId;

public class PowerAttack {
    // public class boolean that checks if you are playing
    public static boolean playing = true;

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // list of all my ints
        // the base strength for the user
        int userStr = 3;
        // the base armor for the computer
        int compArmor = 11;
        // the computer hp
        int monHP = 5;
        // starting damage
        int damage = 0;
        // while loop to check if you are still playing
        while (playing) {
            // checking if total damage is more the computer's HP
            if (damage <= monHP) {
                // checking if the user temp strength is above the computer's armor
                if (userStr <= compArmor) {
                    System.out.println("Do you want to attack roll?");
                    String userRespose = "yes";
                    String rollCheck = s.nextLine();
                    rollCheck = rollCheck.toLowerCase();

                    // checking if rollcheck equals yes to continue to roll
                    if (rollCheck.equals(userRespose)) {
                        userStr = 3;
                        // adding a random strength roll to the user base strength
                        userStr += (Math.random() * 10 + 1);
                        System.out.println("You tried to hit the monster with an attack of " + userStr);

                    }
                    // if you put anything else you cannot play boohoo
                    else {
                        System.out.println("Well you died.");
                        playing = false;
                        s.close();
                    }
                }
                // if your temporary strength is more the the armor class
                else {
                    System.out.println("You have a Strength of " + userStr + ".");
                    System.out.println("You got a hit!");
                    // the computer hp is lessened by the difference in userstrength and armor
                    damage += userStr - compArmor;
                    int newMonHP = monHP - damage;
                    // if the HP is zero set it to zero
                    if (newMonHP < 0) {
                        newMonHP = 0;
                    }
                    System.out.println("The monster now has " + newMonHP + "/" + monHP + "health.");
                    userStr = 3;
                }
                // when the damage is equal to 0 you defeat the monster and stop playing
            } else {
                System.out.println("You have defeated the monster!");
                playing = false;
            }
        }
    }

}