import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b; i++) {
            System.out.print(a + " ");
            if (a % 2 != 0) {
                a *= 2;
                i = a;
            }
            else {
                a += 3;
                i = a;
            }
        }
    }
}