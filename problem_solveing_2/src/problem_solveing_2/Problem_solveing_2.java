package problem_solveing_2;
import java.util.Scanner;

public class Problem_solveing_2 {

    public static void main(String[] args) {
        Scanner Area_of_a_Circle = new Scanner (System.in);
        System.out.print("Enter the value of A:");
        double A = Area_of_a_Circle.nextDouble();
        double pi = 3.14159;
        double B = pi * Math.pow(A, 2);
        System.out.printf("A=%.4f%n", A);
        Area_of_a_Circle.close();
        
    }
    
}
