import java.util.Scanner;

public class MadLib{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        String genericLocation;
        int wholeNumber;
        String pluralNoun;

        System.out.println("Enter a person's name: ");
        firstName = scnr.next();

        System.out.println("Enter a location: ");
        genericLocation = scnr.next();

        System.out.println("Enter a number: ");
        wholeNumber = scnr.nextInt();

        

        System.out.println("Enter a plural noun: ");
        pluralNoun = scnr.next();

        System.out.println(firstName + " went to " + genericLocation + " to buy " + wholeNumber + " different types of " + pluralNoun + "!");
        scnr.close();
    }
}