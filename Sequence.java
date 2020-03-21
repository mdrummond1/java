/*Matthew Drummond
3/10/2020
Sequence.java
*/

import java.util.Scanner; 

public class Sequence {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int start;
      int stop;

      //Get start of sequence
      System.out.println("Enter start of sequence: ");
      start = scnr.nextInt();

      //Get end of sequence
      System.out.print("Enter a stop value: ");
      stop = scnr.nextInt();

      System.out.print("Sequence: ");
      //output sequence
      for (int i = start; i <= stop; i++){
         System.out.print(i + " ");
            
      }
      
      System.out.print('\n');
   }
}
