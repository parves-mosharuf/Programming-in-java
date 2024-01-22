package problem_solveing_4;
import java.util.Scanner;
public class Problem_solveing_4 {
    public static void main(String[] args) {
        Scanner Simple_Product = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int number1 = Simple_Product.nextInt();
        System.out.print("Enter the second integer: ");
        int number2 = Simple_Product.nextInt();
        int product = number1 * number2;
        System.out.println("PROD = " + product);
        Simple_Product.close();
    }
}
