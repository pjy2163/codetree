import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[100];
        int n = sc.nextInt();
        
        arr[2] = n;
        arr[1] = 1;
        System.out.print(arr[1] + " " + arr[2] + " ");
        
        for (int i = 3; i < 100; i++) {
            arr[i] = arr[i-2] + arr[i-1];

            System.out.print(arr[i] + " ");

            if(arr[i] >= 100) {
                break;
            }
           
        } 
    }
}
