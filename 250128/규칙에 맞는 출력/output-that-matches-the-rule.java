import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //int cnt = n - i;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(n-i+j + " ");
            }
            System.out.println();
        }
    }
}