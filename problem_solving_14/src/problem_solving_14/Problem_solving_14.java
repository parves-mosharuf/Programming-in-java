package problem_solving_14;
import java.util.Scanner;
/**
 *
 * @author parvesmosharuf
 */
public class Problem_solving_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int distance = scanner.nextInt();
        double fuel = scanner.nextDouble();
        
        double averageConsumption = distance / fuel;
        
        System.out.printf("%.3f km/l%n", averageConsumption);
        
        scanner.close();
    }
    
}
