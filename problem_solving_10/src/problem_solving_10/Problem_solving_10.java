
package problem_solving_10;
import java.util.Scanner;
/**
 *
 * @author parvesmosharuf
 */
public class Problem_solving_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int code1 = scanner.nextInt();
        int quantity1 = scanner.nextInt();
        double price1 = scanner.nextDouble();
        int code2 = scanner.nextInt();
        int quantity2 = scanner.nextInt();
        double price2 = scanner.nextDouble();

        double totalAmount = (quantity1 * price1) + (quantity2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalAmount);

        scanner.close();
    }
    
}
