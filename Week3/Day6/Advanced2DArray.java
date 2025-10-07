package week3;
import java.util.*;

public class Advanced2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();

        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        System.out.println("\nRow Sum:");
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++)
                sum += mat[i][j];
            System.out.println("Row " + (i + 1) + " sum = " + sum);
        }

        System.out.println("\nColumn Sum:");
        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++)
                sum += mat[i][j];
            System.out.println("Col " + (j + 1) + " sum = " + sum);
        }

        System.out.println("\nTranspose:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++)
                System.out.print(mat[j][i] + " ");
            System.out.println();
        }
        sc.close();
    }
}
