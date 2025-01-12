import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        while (true){
            int n = sc.nextInt();
            double avg = sum/cnt; 

            if(n > 29) {
                break;
            }
            cnt++;
            sum +=n;
        }
        System.out.printf("%.2f\n",avg);
    }
}