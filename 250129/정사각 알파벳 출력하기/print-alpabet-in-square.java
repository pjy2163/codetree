import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //char x = sc.next().charAt(0);
        for (int i = 0; i < n; i++) {
            for (int j = 65 + i; j < 65 + i + n; j++) {
                System.out.print((char)(j+i));
            }
            System.out.println();
        }
    }
}
