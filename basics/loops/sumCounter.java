package basics.loops;

public class sumCounter {
  public static void main(String[] args) {
    
  //ADDITIONAL Exercise: Sum of Numbers
    // Write a pogram that adds numbers from 1 to 10
    //Expected output: Total = 55
  

    int total = 0; 

    for(int i = 0; i <= 10; i++){
      total += i; //aka total = total + i;
    }
      System.out.println("Total: " + total);
    
  }

}

