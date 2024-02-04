package problem_solving_13;
import java.util.Scanner;

/**
 *
 * @author parvesmosharuf
 */
public class Problem_solving_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int greatest = a > b ? (a > c ? a : c) : (b > c ? b : c);
        
        System.out.println(greatest + " eh o maior");
        
        scanner.close();
    }
    
}
