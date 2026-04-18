
/* Topic: Java Construtors
Concepts Practiced:
- Creating and calling a construcotr

Author: Sheriff 
Date: April 14th, 2026
*/



public class Player {

  /* EXERCISE - Take the player class from the
    classMethods Exercise, and add a constructor
    to call the same code.
  */
  
  //Attributes
  String name;
  int health = 100; //Start at 100 health

  //Create a constructor
  public Player(String name, int health) {  //Set initial values
    this.name = name; //Initialize the variables
    this.health = health;
  }

  //create the takeDamage() method
   void takeDamage(int damage) {
    if (health <= 0) { //If the user health is below 0
      System.out.println(name + " has died.");
    } else { 
      health -= damage; //Remove the damage from health
      System.out.println(name + " took " + damage + " damage.");
    }
  }

  //Create the heal() method
  void heal(int amount){
    health += amount; //Add amount to the health
    if (health > 100) {   //User health cannot exceed 100
      health = 100; //Don't change the value of health
      System.out.println(name + " is at max health.");
    } else { //If user can be healed
      System.out.println(name + " was healed " + amount + " health.");
    }
  }

  public static void main(String[] args) {

    //Create 2 player objects and call constructor
    Player player1 = new Player("Reef", 90); 
    Player player2 = new Player("Zay", 80); 

    //Damage player 1
    player1.takeDamage(10);
    //Heal Player 2
    player2.heal(10);

    //Print Results
    System.out.println(player1.name + " now has " + player1.health + " health.");
    System.out.println(player2.name + " now has " + player2.health + " health.");
  }
}
