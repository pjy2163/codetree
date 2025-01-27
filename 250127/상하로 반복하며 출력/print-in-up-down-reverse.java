import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = n; j > 0; j--) {
                    if (j % 2 == 0) {
                        System.out.print(i+1);
                    }
                    else {
                        System.out.print(n-i);
                    }
                }
                System.out.println();
            }
            
        }
        else {
            for (int i = 0; i < n; i++) {
                for (int j = n; j > 0; j--) {
                    if (j % 2 == 0) {
                        System.out.print(n-i);
                    }
                    else {
                        System.out.print(i+1);
                        
                    }
                }
                System.out.println();
            }
        }
    }
}