import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("0.");

        for (int i = 0; i <20; i++) {

            a *= 10;
            System.out.printf("%d", a / b);
            a %= b;

        }
    }
}
