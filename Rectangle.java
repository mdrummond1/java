/*Matthew Drummond
  Rectangle Class that holds length and width of a rectangle object.
  Also calculates area and perimeter of that object*/

public class Rectangle {
   private int length;
	private int width;

   public Rectangle() {
	   length = 10;
	   width = 10;
   }

   public void setLength(int l) {
	   length = l;
   }
   
   public void setWidth(int w) {
	   width = w;
   }

   public int getLength() {
	   return length;
   }

   public int getWidth() {
	   return width;
   }

   public int calculateArea() {
	   return length * width;
   }
   public int calculatePerimeter(){
      return (2 * length) + (2 * width);
   }
}