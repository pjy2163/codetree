import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();


        if (a > c ||(a == c && b > d)) {
            System.out.print("A");
        }
        else {
            System.out.print("B");
        }
    }
}