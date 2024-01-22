
package problem_solveing_7;

import java.util.Scanner;

public class Problem_solveing_7 {

    public static void main(String[] args) {
        Scanner Difference = new Scanner(System.in);
        System.out.print("Enter the valre of A:");
        int A = Difference.nextInt();
        System.out.print("Enter the valre of B:");
        int B = Difference.nextInt();
        System.out.print("Enter the valre of C:");
        int C = Difference.nextInt();
        System.out.print("Enter the valre of D:");
        int D = Difference.nextInt();
        int difference = (A * B) - (C * D);
        System.out.printf("DIFERENC = %d%n", difference);

        Difference.close();
    }
}
