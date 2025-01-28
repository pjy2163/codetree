import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt_even = 0;
        int cnt_odd = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                cnt_even++;
                if(i % 2 == 0) {
                    System.out.print(cnt_even + " ");
                    cnt_odd = cnt_even + 2;
                }
                else {
                    System.out.print(cnt_odd + " ");
                    cnt_even = cnt_odd;
                    cnt_odd += 2;
                }
            }
            System.out.println();
        }
    }
}