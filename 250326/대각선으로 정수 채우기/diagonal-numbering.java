import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        int[][] arr2d = new int[n][m];  
        int num = 1;  
       
        for (int col = 0; col < m; col++) {
            int i = 0;  
            int j = col;  
            while (i < n && j >= 0) {  
                arr2d[i][j] = num++;
                i++;
                j--;
            
        }

        for (int row = 1; row < n; row++) {
            int i = row;  
            int j = m - 1;  
            while (i < n && j >= 0) {  
                arr2d[i][j] = num++;
                i++;
                j--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
