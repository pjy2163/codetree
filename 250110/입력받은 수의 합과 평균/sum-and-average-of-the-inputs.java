import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sumVal = 0;
        
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            sumVal += a;
        }  
        double avg = sumVal / (double)n; 
        System.out.print(sumVal + " ");
        System.out.printf("%.1f",avg);
    }
}
