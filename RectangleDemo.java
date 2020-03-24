/*Matthew Drummond
  3/24/2020  
Driver for Rectangle class to test calculatePerimeter and calculateArea
  
*/
import java.util.Scanner;


public class RectangleDemo {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
      
	   int length, width;

	   Rectangle r = new Rectangle();
	   
	   System.out.println("Enter a length: ");
	   length = scnr.nextInt();

	   System.out.println("Enter a width: ");
	   width  = scnr.nextInt();

	   r.setLength(length);
       r.setWidth(width);

	  
	   System.out.println("The area of a " + r.getLength() + " by " + r.getWidth() + " rectangle is " + r.calculateArea());
	   System.out.println("The perimeter is " + r.calculatePerimeter());
	   scnr.close();
   }
}
