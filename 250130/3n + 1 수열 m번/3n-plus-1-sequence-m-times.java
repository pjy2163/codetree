import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int n = sc.nextInt();
            int cnt = 0;

            for(;;) {
                if (n != 1) {
                    if (n % 2 == 0) {
                        n = n / 2;
                        cnt++;
                    }
                    else {
                        n = n * 3 + 1;
                        cnt++;
                    }
                }
                else {
                    break;
                }
            }
            System.out.println(cnt);
        }
    }
}
