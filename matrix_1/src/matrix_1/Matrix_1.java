package matrix_1;
import java.util.Scanner;

public class Matrix_1 {
    public static void main(String[] args) {
        Scanner parves = new Scanner(System.in);
        int a = parves.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
