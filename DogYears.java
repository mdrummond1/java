import java.util.Scanner;

public class DogYears {
   public static void main(final String[] args) {
      final Scanner scnr = new Scanner(System.in);
      int dogYears;
      int humanYears;

      dogYears = scnr.nextInt();
      humanYears = 7 * dogYears;

      System.out.print("A ");
      System.out.print(dogYears);
      System.out.print(" year old dog is about a ");
      System.out.print(humanYears);
      System.out.println(" year old human.");
   }
}