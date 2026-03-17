package methods;

public class Calculator {
  
  //Addition Method
  public static int add(int a, int b){
    return a + b;
  }

  //Subtraction Method
  public static int subtract (int a, int b) {
    return a - b;
  } 
  
  //Multiplication Method
  public static int multiply (int a, int b) {
    return a * b;
  }

  

  public static void main(String[] args) {
    
    //Showcase each method
    int result1 = add(7, 3);  
    int result2 = subtract(1, 2);
    int result3 = multiply(3, 2);

    //Print the results
    System.out.println("Addition Result: " + result1 );
    System.out.println("Subtraction Result: " + result2 );
    System.out.println("Multiplication Result: " + result3 );
    
    //OR Call the method directly in the print statement
    System.out.println("Addition : " + add(2, 8) );
  
  }
}
