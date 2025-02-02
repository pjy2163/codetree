import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[] countArr = new int[10];
        int[] arr = new int[100];
        int cnt = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0) {
                break;
            }
            cnt++;
        }
        for (int i = 0; i < cnt; i++) {
                if(arr[i] >= 10) {
                    countArr[arr[i]/10]++;
                }
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " - " + countArr[i]);
        }
    }
}
