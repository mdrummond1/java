/*Matthew Drummond
3/17/2020
Player points:
    1. prompt user to enter 5 numbers and output on one line separated by spaces
    2. Output the sum of these points
    3. output the average
    4. output the highest score
    */


import java.util.Scanner;

public class PlayerPoints{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int[] scores = new int[5];
        int max = 0;
        int sum = 0;
        
        for (int i = 0; i < 5; i++){
            System.out.println("Enter score: ");
            scores[i] = scnr.nextInt();
            
            //tally scores
            sum += scores[i];
            
            //keep track of maximum as they are being read in
            if (scores[i] > max){
                max = scores[i];
            }

        }

        //output values entered
        System.out.print("You entered: ");
        for (int i = 0; i < 5; i++){
            System.out.print(scores[i] + " ");
            if (i == 4){
                System.out.print("\n\n");
            }
        }
        
        
        System.out.println("Total points: " + sum);
        System.out.println("Average points: " + sum / 5.0);
        System.out.println("Highest points: " + max);

        scnr.close();
    }
}