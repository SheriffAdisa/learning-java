/*
Topic: Classes / Objects
Concepts Practiced:
- creating a class
- creating an object

Author: Sheriff 
Date: March 24, 2026
*/

public class Person {
  
  //attributes (variables)
  String name;
  int age;

  //Method Name
  void introduce() {
    System.out.println("Hi, my name is " + name);
  }

  public static void main(String[] args) {
    
    //create an Object of type Person
    Person p1 = new Person();
    
    //assign values
    p1.name = "Reef";
    p1.age = 22;

    //call the object.
    p1.introduce();
  }


}
