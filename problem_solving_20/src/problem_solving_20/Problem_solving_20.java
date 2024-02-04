package problem_solving_20;
import java.util.Scanner;
/**
 *
 * @author parvesmosharuf
 */
public class Problem_solving_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int days = scanner.nextInt();
        
        int years = days / 365;
        days = days % 365;
        
        int months = days / 30;
        days = days % 30;
        
        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");
        
        scanner.close();
    }
    
}
