import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 3;

        while (a <= n) {
            System.out.print(a + " ");
            a +=3 ;
        }
    }
}