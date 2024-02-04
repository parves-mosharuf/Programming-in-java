package problem_solving_16;
import java.util.Scanner;

/**
 *
 * @author parvesmosharuf
 */
public class Problem_solving_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int distance = scanner.nextInt();
        
        int timeInMinutes = distance * 2;
        
        System.out.println(timeInMinutes + " minutos");
        
        scanner.close();
    }
    
}
