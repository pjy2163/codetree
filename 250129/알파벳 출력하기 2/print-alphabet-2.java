import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print((char)cnt + " ");
                cnt++;
                if (cnt == 91) {
                    cnt = 65;
                }
            }
            System.out.println();
        }
    }
}
