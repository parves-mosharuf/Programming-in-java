package array_test_1;
import java.util.Scanner;
/**
 *
 * @author parvesmosharuf
 */
public class Array_test_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        // seconds ay vabe oo kora jai..
        int [] x = new int [10];
        //3rd ay vabe oo kora jai...
        //x[0]=44;
        //x[1]=85;
        for (int i = 0; i<x.length;i++){
            x[i] = scan.nextInt();
        }
        ///x = new int [] {22, 44};
        // fast ay vabe oo kora jai.
        //int [] x = {45,88,77,22,39};
        for (int i = 0; i<x.length;i++){
            System.out.println( x [i]);
        }
    }
    
}
