import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 2;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
               
                if (cnt > 8) {
                    cnt = 2;
                }
                System.out.print(cnt + " ");
                cnt+=2;
            }
            System.out.println();
        }
    }
}