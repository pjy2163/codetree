import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[] countArr = new int[10];
        int n = sc.nextInt();
        int[] arr = new int[100];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
                countArr[arr[i]]++;
            }
        for (int i = 1; i < 10; i++) {
            System.out.println(countArr[i]);
        }
    }
}
