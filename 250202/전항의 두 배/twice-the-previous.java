import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[100];
        int a = sc.nextInt();
        int b = sc.nextInt();

        arr[1] = a;
        arr[2] = b;
        
        for (int i = 3; i <= 10; i++) {
            arr[i] = arr[i-1] + 2 * arr[i-2];
        }
        for (int i = 1; i <= 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
