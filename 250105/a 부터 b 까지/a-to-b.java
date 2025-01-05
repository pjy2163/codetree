import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a + " ");

        for(int i = a; i <= b; i++) {
            if (a % 2 != 0) {
                a *= 2;
                System.out.print(a + " ");
                i = a;
            }
            else {
                a += 3;
                System.out.print(a + " ");
                i = a;
            }
        }
    }
}