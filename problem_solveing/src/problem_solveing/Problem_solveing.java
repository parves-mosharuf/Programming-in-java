package problem_solveing;
import java.util.Scanner;

public class Problem_solveing {

    public static void main(String[] args) {
        Scanner problem_solveing_1=new Scanner(System.in);       
        System.out.print("Enter the value of A:");
        int A = problem_solveing_1.nextInt();
        System.out.print("Enter the value of B:");
        int B = problem_solveing_1.nextInt();
        int X = A+B;
        System.out.println("X="+X);
        problem_solveing_1.close();
    }
    
}
