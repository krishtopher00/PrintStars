/**
* This is a program that takes in an integer and then prints
* that amount of stars, followed by one less than that amount of stars
* @author Krish Bhavnani
* @version 1.0
*/

import java.util.Scanner;
public class PrintStars{
  public static void main(String[] args){
    /**
    * This is the main method
    * @param args This is the command line
    * @ return This program does not return anything
    */
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter an integer: ");
    int numStars = s.nextInt();
    starBottomUp(numStars);
    System.out.println();
    starTopDown(numStars);

  }

  public static void starBottomUp(int n){
    /**
    * @param n Integer entered by the user to indicate the amount of stars
    * @return This method does not return anything
    */
    int x = 0;
    while(x < n){
      String s ="";
      for(int t = n - x; t <= n; t++){
        s  = s +"*";
      }
      System.out.println(s);
      x++;
    }
  }

  public static void starTopDown(int n){
    /**
    * @param n Integer entered by the user to indicate the amount of stars
    * @return This method does not return anything
    */
    int x = 1;
    while(x <= n){
      String s ="";
      for(int t = x; t <= n; t++){
        s  = s + "*";
      }
      System.out.println(s);
      x++;
    }
  }

}
