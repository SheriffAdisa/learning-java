package basics;
/* Exercise: Number Counter

Write a program that prints numbers 1 to 10 using a for loop.

Expected output:

1
2
3
4
5
6
7
8
9
10 */

public class NumberCounter {
  
  public static void main(String[] args) {
    //Challenge 1 
    for(int i=0; i<10; i++){  //(current count, counting up to..., update count)
      System.out.println(i); //print currennt count
    }


    //Optional challenge: Print only even numbers from 2 to 20
    // for(int i = 2; i <= 20 ;i+=2 ){
    //   System.out.println(i);
    // }
  }

}
