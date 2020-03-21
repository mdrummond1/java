/*
Matthew Drummond
Calculator program
3/21/2020

Description: A program to do basic mathmatical operations on
two numbers from a user. The user selects options from a menu 
using a number to specify which operation will be used.
*/

import java.util.Scanner;

public class Calculator {


   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

   	int number1;            // A number
	   int number2;            // A second number
	   int choice;             // The user's menu option

   	System.out.println("Enter a number: ");
	   number1 = scnr.nextInt();

   	System.out.println("Enter another number: ");
   	number2 = scnr.nextInt();

	do {

	    choice = displayMenu(scnr);
	    System.out.println();

   		if (choice == 1) {
			add(number1, number2);
		}
		else if (choice == 2) {
			subtract(number1, number2);
		}
		else if (choice == 3){
			multiply(number1, number2);
		}
		else if (choice == 4){
			divide(number1, number2);
		}
		else
	    	System.out.println("Sorry, that is not a valid option");

        System.out.println();
   		System.out.println("Do you want to try another option (1 for yes, 2 for no)");
		   choice = scnr.nextInt();
   	} while (choice != 2);

	   System.out.println("Goodbye!");
   } //end of main()

   /***************************************************
   displayMenu prints the menu options and returns
   the selected option
   ****************************************************/
   public static int displayMenu(Scanner scnr) {

	   int choice;             

	   //display a list of menu options
   	System.out.println();
	   System.out.println("Select an option (Enter 1 to add)");
   	System.out.println("1: add");
	   System.out.println("2: subtract");
	   System.out.println("3: multiply");
	   System.out.println("4: divide");
	
	   choice = scnr.nextInt();

	   return choice;
   }

   /***************************************************
   add() receives two numbers 
   It adds the numbers and displays the sum
   ****************************************************/
   public static void add(int num1, int num2) {
	   int sum;

	   sum = num1 + num2;
	   System.out.println(num1 + " + " + num2 + " = " + sum);
   }

   /***************************************************
   subtract() receives two numbers
   It subtracts the second number from the first 
   and displays the difference
   ****************************************************/
   public static void subtract(int num1, int num2) {
	   int difference;

	   difference = num1 - num2;
	   System.out.println(num1 + " - " + num2 + " = " + difference);
   }
   /***************************************************
	multiply() receives two numbers
    It multiples the first by the second
   	and displays the result
	***************************************************/
	public static void multiply(int num1, int num2){
		int result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
	}
	/***************************************************
	divide() receives two numbers
    It divides the first by the second
   	and displays the result
	***************************************************/
	public static void divide(int numerator, int denominator){
		int result = numerator / denominator;
		System.out.println(numerator + " / " + denominator + " = " + result);
	}
   
}// end of Calculator