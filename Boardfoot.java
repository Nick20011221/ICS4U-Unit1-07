import java.util.Scanner;

/**
 * This program calculates the boardfoot givin two dimesions.
 * 
 * @author Nick P-A
 * @since 2020/2/13 feb 27 2020
 * @version 1.0
 */

 
public class Boardfoot {
  
  /**
  * This program calculates the boardfoot givin two dimesions.
  */
 
  public static double boardFoot(double length, double width) {
    double height = 144 / (length * width);
    return height;
  }
  
  /**
  * This program calculates the boardfoot givin two dimesions.
  */
  
  public static double boardFoot(double length, double width, double height) {
    
    if (length == 0) {
      length = 144 / (width * height);
      return length;
    } else {
      width = 144 / (length * height);
      return width;
    }
  }
  
  /**
  * This program calculates the boardfoot givin two dimesions.
  */
 
  public static void main(String[] args) {
    double length;
    double width;
    double height;
  
    Scanner userInput = new Scanner(System.in);
    
    System.out.print("Enter the length, if it is missing enter 0: ");
    try {
      length = userInput.nextDouble();
      System.out.print("Enter the width, if it is missing enter 0: ");
      width = userInput.nextDouble();
      System.out.print("Enter the height, if it is missing enter 0 ");
      height = userInput.nextDouble();
      
      if (length == 0 || width == 0 || height == 0) {
        if (height == 0  && width != 0  && length != 0) {
          System.out.println("The board foot height is " 
              + Math.round(boardFoot(length, width) * 100.0) / 100.0 + " inches.");
        } else if ((length == 0  && width != 0  && height != 0)) {
          System.out.println("The board foot length is " 
              + Math.round(boardFoot(length, width, height) * 100.0) / 100.0 + " inches.");
        } else if (width == 0  && length != 0  && height != 0) {
          System.out.println("The board foot width is " 
              + Math.round(boardFoot(length, width, height) * 100.0) / 100.0 + " inches.");
        }
      } 
    } catch (Exception e) {
      System.err.println("enter a number");
    }
  }
}