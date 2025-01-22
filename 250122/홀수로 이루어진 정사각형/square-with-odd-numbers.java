import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
    
        for (int i = 1; i <= (2*n)-1; i+=2) {
            for (int j = 10; j < 10+(2*n); j+=2) {
                System.out.printf("%d ",j+i);
            }
            System.out.println();
        }
    }
}