
package problem_solveing_5;

import java.util.Scanner;

public class Problem_solveing_5 {
    public static void main(String[] args) {
        Scanner Average_1 = new Scanner(System.in);
        double A = Average_1.nextDouble();
        double B = Average_1.nextDouble();
        double average = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);
        System.out.printf("MEDIA = %.5f%n", average);

        Average_1.close();
    }
}
