package matrix_12;
//import java.util.Scanner;

/**
 *
 * @author parvesmosharuf
 */
public class Matrix_12 {
    //Scanner parves = new Scanner (System.in);
    //int x = parves.nextInt();
    public static void main(String[] args) {
        int n =11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
