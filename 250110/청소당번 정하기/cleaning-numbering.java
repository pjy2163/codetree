import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt_class = 0;
        int cnt_fl = 0;
        int cnt_bath = 0;
        int i = 1;

        while(i<=n){
            
            if(i % 2 == 0) {
                cnt_class++;
                if(i % 6 == 0) {
                    cnt_class--;
                }
            }
            if(i % 3 == 0 && i % 12 != 0) {
                cnt_fl++;
            }
            if(i % 12 == 0) {
                cnt_bath++;
            }
            i++;
           
        }
        System.out.print(cnt_class + " ");
        System.out.print(cnt_fl + " ");
        System.out.print(cnt_bath);
    }
}
