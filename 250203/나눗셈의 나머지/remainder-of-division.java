import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[] countArr = new int[10];
        int[] arr = new int[100];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        int sum = 0;

        arr[0] = a;

        for (int i = 0; i < 100; i++) {
            arr[i+1] = arr[i] / b;
            if(arr[i] <= 1) {
                break;
            }
            cnt++;
        }
        for (int i = 0; i < cnt; i++) {
            //if (arr[i] % b < 10) {
            countArr[arr[i] % b]++;
           // }
        }
     
        for (int i = 0; i < 10; i++) {
            sum += countArr[i] * countArr[i];
        }
        System.out.print(sum);
    }
}