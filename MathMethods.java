import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double x, y, z;
        
        x = scnr.nextDouble();
        y = scnr.nextDouble();
        z = scnr.nextDouble();
        System.out.println(Math.pow(x, z));
        System.out.println(Math.abs(y));
        System.out.println(Math.sqrt(x * y));
        scnr.close();
    }
}