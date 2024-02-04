package problem_solving_17;
import java.util.Scanner;
/**
 *
 * @author parvesmosharuf
 */
public class Problem_solving_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int time = scanner.nextInt();
        int speed = scanner.nextInt();
        
        double distance = time * speed;
        double fuelNeeded = distance / 12.0; // Assuming the car does 12 Km/L
        
        System.out.printf("%.3f%n", fuelNeeded);
        
        scanner.close();
    }
    
}
