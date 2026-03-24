/*
Topic: Methods
Concepts Practiced:
- Creating a method
- Calling a method
- Reusing Logic from previous code 

Author: Sheriff 
Date: March 17, 2026
*/

package methods;

/*EXERCISE 1 - Greeting System
    Create a method that:
      - Takes a name
      - Prints "Hello [name], welcome back!" */

public class GreetingSystem {

  public static void welcomeMessage(String name) {
    System.out.println("Hello " + name + ", welcome back!");
  }

  public static void main(String[] args) {
    welcomeMessage("Sheriff");
  }

}

