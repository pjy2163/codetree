import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr2d = new int[n][n];

        int num = 0;

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) { 
                for (int j = 0; j < n; j++) {
                    arr2d[j][i] = num++;
                }
            } 
            else { 
                for (int j = n - 1; j >= 0; j--) {
                    arr2d[j][i] = num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
