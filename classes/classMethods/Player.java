package classes.classMethods;
/* Topic: Java Class Methods
Concepts Practiced:
- Creating static and non static methods
- Modifying a method

Author: Sheriff 
Date: April 10th, 2026
*/

public class Player {

  /* EXERCISE - Create a Player class
  Requirements 
  - Player class should have:
    -Attributes
     - name 
     - health
  - Methods:
    - takeDamage (int damage)
    - heal (int amount)
  - In Main:
    - Create 2 players
    - Damage One
    - Heal one
    - Print the results */
  
  //Attributes
  String name;
  int health = 100; //Start at 100 health

  //create the takeDamage() method
   void takeDamage(int damage) {
    if ( health < 0) { //If the user health is below 0
      System.out.println(name + " has died.");
    } else { 
      health -= damage; //Remove the damage from health
      System.out.println(name + " took " + damage + " damage.");
    }
  }

  //Create the heal() method
  void heal(int amount){
    health += amount; //Add amount to the health
    System.out.println(name + " was healed " + amount + " health.");
  }

  public static void main(String[] args) {

    //Create 2 player objects
    Player player1 = new Player(); 
    Player player2 = new Player(); 

    //Damage player 1
    player1.name = "Reef";
    player1.takeDamage(10);
    //Heal Player 2
    player2.name = "Zay";
    player2.heal(10);

    //Print Results
    System.out.println(player1.name + " now has " + player1.health + " health.");
    System.out.println(player2.name + " now has " + player2.health + " health.");
  }
}
