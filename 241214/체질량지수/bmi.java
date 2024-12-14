import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        w *= 10000;
        h *= h;

        double b = w / h;

        System.out.print(Math.round(b));

        if (b > 24) {
            System.out.print("\nObesity");
        }
    }
}