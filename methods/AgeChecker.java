package methods;

/*EXERCISE 2 - Age Checker
  Reuse the code from ageChecker 
    (basics\if-statemets\ageChecker.java)
  but put it in a method and call the method 
*/


public class AgeChecker {

  public static void checkAge(int age){
    
    //(REUSED THE CODE FROM ageChecker.java)
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

  public static void main(String[] args) {
    checkAge(18);   //Will output the corresponding answer
  }
  
}
