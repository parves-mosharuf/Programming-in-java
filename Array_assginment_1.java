package array_assginment_1;
import java.util.Scanner;
/**
 *
 * @author parvesmosharuf
 */
public class Array_assginment_1 {
    public static void main(String[] args) {
        Scanner parves = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = parves.nextInt();
        }
        int b = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > b) {
                b = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
        }
        System.out.println("Total array : " + b);
    }
}