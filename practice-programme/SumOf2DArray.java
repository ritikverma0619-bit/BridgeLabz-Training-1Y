import java.util.Scanner;

class SumOf2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int sum = 0;

        // Taking 2D array input
        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Calculating sum using for loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum = sum + arr[i][j];
            }
        }

        // Printing result
        System.out.println("Sum of 2D array elements = " + sum);

        sc.close();
    }
}
