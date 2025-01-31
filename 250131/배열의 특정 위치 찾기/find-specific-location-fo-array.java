import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int sum_three = 0;
        double avg = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 != 0) {
                sum += arr[i];
            }
            sum_three = arr[2] + arr[5] + arr[8];
        }
        avg = (double)sum_three / 3;
        System.out.printf("%d %.1f",sum,avg);
    }
}
