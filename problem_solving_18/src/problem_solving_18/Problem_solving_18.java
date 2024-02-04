package problem_solving_18;
import java.util.Scanner;
/**
 *
 * @author parvesmosharuf
 */
public class Problem_solving_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int amount = scanner.nextInt();
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};
        
        System.out.println(amount);
        for (int note : banknotes) {
            int count = amount / note;
            System.out.println(count + " nota(s) de R$ " + note + ",00");
            amount = amount % note;
        }
        
        scanner.close();
    }
    
}
