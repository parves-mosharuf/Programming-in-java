package array2;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner parves = new Scanner(System.in);
        int[][] arr = new int[2][5];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = parves.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Enter max value : " + max);
    }
}
