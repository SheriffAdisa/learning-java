package classes;

/* Topic: Class Attributes
Concepts Practiced:
- Creating Attributes
- creating an object
- Modifying an attribute

Author: Sheriff 
Date: April 8th, 2026
*/

public class Student {

  /* EXERCISE - Create a Student class
  Requirements 
  - Attributes: name (String), age(int), grade (double)
  - In main:
    - Create 2 students
    - Give them different values
    - Print their details */
  
  //attributes
   String name;
   int age;
   double grade;

  public static void main(String[] args) {
    
    //create 2 student objects
    Student student1 = new Student();
    Student student2 = new Student();

    //Give each student different values

    //Student 1 
    student1.name = "Reef";
    student1.age = 22;
    student1.grade = 1.1;  
    //Student 2 
    student2.name = "Zay";
    student2.age = 23;
    student2.grade = 2.1;

    //Print the details of each student
    System.out.println("Student: " + student1.name + " is " + student1.age + " and achieved a " + student1.grade);
    System.out.println("Student: " + student2.name + " is " + student2.age + " and achieved a " + student2.grade);

    //Change the grade of 1 student and leave the other unaffected
    student2.grade = 1.1;
    //print the changes
    System.out.println("Student: " + student2.name + " new grade is a " +student2.grade);
    System.out.println("Student : " + student1.name + " new grade is a " + student1.grade);
  }
}
