//for payroll lab from zybooks
//Matthew Drummond
import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        String lastName;
        int hoursWorked;
        double payRate;
        double takeHomePay;

        //prompt user and get input
        System.out.println("Enter your first name:");
        firstName = scnr.next();

        System.out.println("Enter your last name:");
        lastName = scnr.next();

        System.out.println("Enter your hours worked:");
        hoursWorked = scnr.nextInt();

        System.out.println("Enter your pay rate:");
        payRate = scnr.nextDouble();

        takeHomePay = hoursWorked * payRate;
        
        System.out.println("" + firstName + " " + lastName + ", your pay is $" + takeHomePay);
        scnr.close();
        
    }
}