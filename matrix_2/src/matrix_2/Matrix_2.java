package matrix_2;
import java.util.Scanner;

/**
 *
 * @author parvesmosharuf
 */
public class Matrix_2 {
    public static void main(String[] args) {
        Scanner parves = new Scanner (System.in);
        int a = parves.nextInt();
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    
}
