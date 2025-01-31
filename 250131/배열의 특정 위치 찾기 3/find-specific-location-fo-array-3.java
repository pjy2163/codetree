import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int[] arr = new int[100];
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            }
            cnt++;
           
        }
        for (int i = cnt; i >= cnt-3; i--){
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
