import java.util.Scanner;

import sun.security.provider.certpath.ResponderId;

public class PowerAttack {
    public static boolean playing = true;

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int userStr = 3;
        int compArmor = 11;
        int monHP = 5;
        int damage = 0;
        while (playing) {
            if (damage <= monHP) {
                if (userStr <= compArmor) {
                    System.out.println("Do you want to attack roll?");
                    String userRespose = "yes";
                    String rollCheck = s.nextLine();
                    rollCheck = rollCheck.toLowerCase();

                    if (rollCheck.equals(userRespose)) {
                        userStr = 3;
                        userStr += (Math.random() * 10 + 1);
                        System.out.println("You tried to hit the monster with an attack of " + userStr);

                    } else {
                        System.out.println("Well you died.");
                        playing = false;
                        s.close();
                    }
                } else {
                    System.out.println("You have a Strength of " + userStr + ".");
                    System.out.println("You got a hit!");
                    damage += userStr - compArmor;
                    int newMonHP = monHP - damage;
                    if (newMonHP < 0) {
                        newMonHP = 0;
                    }
                    System.out.println("The monster now has " + newMonHP + "/" + monHP + "health.");
                    userStr = 3;
                }
            } else {
                System.out.println("You have defeated the monster!");
                playing = false;
            }
        }
    }

}