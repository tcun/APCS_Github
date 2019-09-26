import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    //Refer back to your Runestone academy book as needed.
    //Instantiate the world. The world should be 220x220.
    
    //Instantiate a turtle. Name it as you wish.

    /*Have your turtle make 4 boxes in the world. The boxes should be in a 2x2 grid. Similar to this:
     ___ ___ 
    |   |   |
    |___|___|
    |   |   |
    |___|___|

    */


    
    //Finally, set the world to be visible with a boolean...

    //Creating World and Turtle Objects from their classes
    World world = new World(500,500);
    Turtle boxTurtle = new Turtle(250,250, world);
    //First square
    boxTurtle.forward();
    boxTurtle.turnRight();
    boxTurtle.forward();
    boxTurtle.turnRight();
    boxTurtle.forward();
    boxTurtle.turnRight();
    boxTurtle.forward();
    //Second Square
    boxTurtle.forward();
    boxTurtle.turnRight();
    boxTurtle.forward();
    boxTurtle.turnRight();
    boxTurtle.forward();
    boxTurtle.turnRight();
    boxTurtle.forward();
    //Third Square
    boxTurtle.forward();
    boxTurtle.turnRight();
    boxTurtle.forward();
    boxTurtle.turnRight();
    boxTurtle.forward();
    boxTurtle.turnRight();
    boxTurtle.forward();
    //Fourth Square
    boxTurtle.forward();
    boxTurtle.turnRight();
    boxTurtle.forward();
    boxTurtle.turnRight();
    boxTurtle.forward();
    boxTurtle.turnRight();

    //Running Executablwe window to see square
    world.show(true);
  }
}
