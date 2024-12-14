import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");

        int first = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("010-%d-%d",b,a);

    }
}