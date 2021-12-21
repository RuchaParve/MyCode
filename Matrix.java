import java.util.*;
import java.io.*;

public class Matrix {

    static void accept(int m, int n, int a[][]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter all the elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

    }

    static void display(int m, int n, int c[][]) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows, column in first matrix:");
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int a[][] = new int[n1][m1];
        accept(m1, n1, a);

        System.out.println("Enter rows and columns of second matrix");
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int b[][] = new int[n2][m2];
        accept(m2, n2, b);

        System.out.println("First Matrix :");
        display(m1, n1, a);
        System.out.println("Second Matrix :");
        display(m2, n2, b);

        int c[][] = new int[m1][n2];
        if (m1 == n2) {
            // multiply(a,b);
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    for (int k = 0; k < n2; k++) {
                        c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    }

                }
            }
        } else {
            System.out.println("Matrix multiplication is not possible");
        }
        System.out.println("Resultant Matrix :");
        display(m1, n1, c);
    }
}
