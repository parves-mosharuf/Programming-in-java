package matrix_3;
import java.util.Scanner;

/**
 *
 * @author parvesmosharuf
 */
public class Matrix_3 {
    public static void main(String[] args) {
        Scanner parves =  new  Scanner ( System.in);
        int a = parves.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
