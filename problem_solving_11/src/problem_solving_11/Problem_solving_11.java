package problem_solving_11;
import java.util.Scanner;
/**
 *
 * @author parvesmosharuf
 */
public class Problem_solving_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in);
        double radius = scanner.nextDouble();
        double volume = (4.0/3) * 3.14159 * Math.pow(radius, 3);
        System.out.printf("VOLUME = %.3f%n", volume);
        
    }
    
}
