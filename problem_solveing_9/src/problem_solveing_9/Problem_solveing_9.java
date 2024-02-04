
package problem_solveing_9;
import java.util.Scanner;

/**
 *
 * @author parvesmosharuf
 */
public class Problem_solveing_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sellerName = scanner.nextLine();
        double fixedSalary = scanner.nextDouble();
        double totalSales = scanner.nextDouble();
        double totalSalary = fixedSalary + (0.15 * totalSales);
        System.out.printf("TOTAL = R$ %.2f%n", totalSalary);
        scanner.close();
    }
    
}
