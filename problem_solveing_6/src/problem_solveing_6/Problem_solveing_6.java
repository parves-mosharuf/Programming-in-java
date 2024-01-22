package problem_solveing_6;
import java.util.Scanner;

public class Problem_solveing_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner average2 = new Scanner(System.in);

        double A = average2.nextDouble();
        double B = average2.nextDouble();
        double C = average2.nextDouble();

        double average = ((A * 2) + (B * 3) + (C * 5)) / 10.0;

        System.out.printf("MEDIA = %.1f\n", average);
    }
    
}
