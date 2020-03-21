import java.util.Scanner;

public class Loan {   
    public static void main(String[] args) {      
        final Scanner scnr = new Scanner(System.in);
        int salary;
        int yearsEmployed;

        System.out.println("Enter your salary:");
        salary = scnr.nextInt();

        System.out.println("Enter your years of employment:");
        yearsEmployed = scnr.nextInt();

        if ((salary > 30000) && (yearsEmployed >= 2)){
            System.out.println("You qualify for a loan.");
        }
        else{
            System.out.println("You do not qualify for a loan.");
        }

        scnr.close();
    }
}