package problem_solving_19;
import java.util.Scanner;
/**
 *
 * @author parvesmosharuf
 */
public class Problem_solving_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int seconds = scanner.nextInt();
        
        int hours = seconds / 3600;
        seconds = seconds % 3600;
        
        int minutes = seconds / 60;
        seconds = seconds % 60;
        
        System.out.println(hours + ":" + minutes + ":" + seconds);
        
        scanner.close();
    }
    
}
