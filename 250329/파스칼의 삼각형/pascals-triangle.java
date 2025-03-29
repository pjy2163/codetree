import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[][] arr2d = new int[n][n];

    
        for (int j = 0; j < n; j++) {
            arr2d[j][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j == i) {
                    arr2d[i][i] = 1;
                }
                
                arr2d[i][j] = arr2d[i -1 ][j-1] + arr2d[i-1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
