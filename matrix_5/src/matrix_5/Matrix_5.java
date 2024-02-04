package matrix_5;
import java.util.Scanner;

/**
 *
 * @author parvesmosharuf
 */
public class Matrix_5 {
    public static void main(String[] args) {
        Scanner parves = new Scanner (System.in);
    int a = parves.nextInt();
    for (int i = a; i >= 1; i--) {
            for (int j = a; j >= i; j--) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
    
}
