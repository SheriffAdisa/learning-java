package basics;

public class AgeChecker {
  /*
   * Exercise - Age Checker (conditions - if, else if, else)
   * Create a progrma that stores an age variable and prints:
   * Age Output
      < 13 Child
      13–17 Teenager
      18–64 Adult
      65+ Senior
   
   * Example output: You are an Adult
   
   * Use: if, else if, else
   */

  public static void main(String[] args) {

    int age = 14; // Age to be stored as an int

    if (age < 13) { // Younger than 13
      System.out.println("You are a child");
    } else if (age < 18) { // 13-17
      System.out.println("You are a teenager");
    } else if (age < 65) { // 18-64
      System.out.println("You are an Adult.");
    } else { // 65+
      System.out.println("You are a senior");
    }
  }
}
