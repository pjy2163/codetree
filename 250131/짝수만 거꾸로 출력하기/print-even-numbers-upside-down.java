import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int n = sc.nextInt();
        int cnt = 0;
    
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       
        for (int j = n-1; j >= 0; j--){ 
            if (arr[j] % 2 == 0) {
            System.out.print(arr[j] + " ");
            }
        } 
    }
}