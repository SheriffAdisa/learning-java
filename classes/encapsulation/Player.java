package encapsulation;

/* Topic: Encapsulation
Concepts Practiced:
- Using encapsulation

Author: Sheriff 
Date: April 18th, 2026
*/



public class Player {

  /* EXERCISE - Take the player class from the
    classMethods Exercise, and refactor the code 
    to use encapsulation. Make name and health private,
    add a getName(), getHealth(), setHealth(intHealth) with 
    the 0-100 cap enforced inside the setter.
  */
  
  //Attributes
  private String name;  //set as private
  private int health;  //set access level to private
  //aka - can only be accessed in this class

  // getter for name
  public String getName() { 
    return name;
  }  

  //single parameter constructor
  public Player(String name) { 
    this(name, 100); //Use this() method to set default health to 100
  }  
  
  //double parameter constructor with getter
   public Player(String name, int health) {  //Set initial values
     this.name = name; //Initialize the variables
     this.health = health;
   }

  //Getter for health
  public int getHealth() {
    return health;
  }

  //Setter for health
  public void setHealth(int health) {
    if(health > 100) { 
      this.health = 100; //set health cap
    } else {
      this.health = health; //refer to current object.
    }

  }

  //create the takeDamage() method
   void takeDamage(int damage) {
    if (getHealth() <= 0) { //If the user health is below 0
      System.out.println(name + " has died.");
    } else { 
      setHealth(health - damage); //Remove the damage from health using the setter
      System.out.println(name + " took " + damage + " damage.");
    }
  }

  //Create the heal() method
  void heal(int amount){
    setHealth(health + amount); //Add amount to the health using setter
    if (health > 100) {
      setHealth(100); //Do not change the value 
      System.out.println(name + " is at max health.");
    } else { //If user can be healed
      System.out.println(name + " was healed " + amount + " health.");
    }
  }

  public static void main(String[] args) {

    //Create 2 player objects and call constructor
    Player player1 = new Player("Reef"); //Defaults to 100 health
    Player player2 = new Player("Zay", 70); //Custom Health

    player1.setHealth(40);
    //Damage player 1
    player1.takeDamage(10);
    //Heal Player 2
    player2.heal(10);

    //Print Results
    System.out.println(player1.getName() + " now has " + player1.getHealth() + " health.");
    System.out.println(player2.getName() + " now has " + player2.getHealth() + " health.");
  }
}
