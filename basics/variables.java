// Topic: If Statements
// Concepts Practiced:
// - Variables
// - Concatenation

// Author: Reef
// Date: March 12, 2026
// 

package basics;
public class variables {

  /*
  Practice Exercise
  Convey the following information using variables. 

    Name: Sheriff
    Age: 22
    Height: 1.82m
    Favorite Letter: R
    Is Student: false
  
  You must define the type and name the variable then put everything together in a print statement */

  public static void main(String[] args) {
    // Variables
    String name = "Sheriff";    
    int age = 21;       
    double height = 1.82;
    char favourite_letter = 'R';
    boolean isStudent = false;

    //Concatenate with '+' and not ',' for multiple data types
    System.out.println("Hello, my name is "+ name + 
                      " and I am " + age + " years old. \n" +
                      "I am "+ height + "m tall and my favourite letter is " +
                      favourite_letter + " and am I student? " + isStudent);
  }

}
