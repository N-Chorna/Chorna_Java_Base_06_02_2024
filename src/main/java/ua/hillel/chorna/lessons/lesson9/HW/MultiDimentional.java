package ua.hillel.chorna.lessons.lesson9.HW;

import java.util.Scanner;

public class MultiDimentional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of rows (M): ");
        int MatrixM = scanner.nextInt();
        System.out.print("Please enter the number of columns (N): ");
        int MatrixN = scanner.nextInt();
        int[][] matrix1 = new int[MatrixM][MatrixN];
        int[][] matrix2 = new int[MatrixN][MatrixM];
        System.out.println("Please enter numbers for the matrix:");
        for (int i = 0; i < MatrixM; i++) {
            for (int j = 0; j < MatrixN; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < MatrixM; i++) {
            for (int j = 0; j < MatrixN; j++) {
                matrix2[j][i] = matrix1[i][j];
            }
        }
        System.out.println("\nOriginal matrix:");
        for (int i = 0; i < MatrixM; i++) {
            for (int j = 0; j < MatrixN; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nTransposed matrix:");
        for (int i = 0; i < MatrixN; i++) {
            for (int j = 0; j < MatrixM; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
