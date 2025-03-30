import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr2d = new int[n][n];

        int num = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i % 2 == 0) {
                    arr2d[j][i] = num++;
                }
                else {
                    arr2d[n - 1 - j][i] = num++;
                }
            }
        }
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}