import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cnt++;
                if (i % 2 == 0) {
                    System.out.print(cnt + " ");
                }
            }
            if ( i % 2 != 0) {
                for (int j = n; j > 0; j--) {
                    System.out.print(n*(i)+j + " ");
                }    
            }
            System.out.println();
        }
    }
}