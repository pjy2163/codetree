import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int cnt = 0;
        int sum = 0;
        double avg = 0;
        
        for (int i = 0; i < 10; i++) {
            
            arr[i] = sc.nextInt();

            if(arr[i] == 0){
                break;
            }
            if(arr[i] % 2 == 0) {
                cnt++;
                sum += arr[i];
            }
           // avg = (double)sum / cnt;
        }
        System.out.print(cnt + " " + sum);
    }
}