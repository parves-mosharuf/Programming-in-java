package problem_solveing_3;
import java.util.Scanner;
public class Problem_solveing_3 {
    public static void main(String[] args) {
        Scanner Simple_Sum = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int A = Simple_Sum.nextInt();
        System.out.print("Enter the value of B: ");
        int B = Simple_Sum.nextInt();
        int SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
        Simple_Sum.close();
        
        
    }
    
}
