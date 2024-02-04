package matrix_6;
import java.util.Scanner;

/**
 *
 * @author parvesmosharuf
 */
public class Matrix_6 {
    public static void main(String[] args) {
        Scanner parves = new Scanner (System.in);
        int a = parves.nextInt();
        int count = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    
}
