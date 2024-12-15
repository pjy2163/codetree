import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a%2 != 0) {
            System.out.print("odd\n");
        }
        else {
            System.out.print("even\n");
        }    
        if (b%2 != 0) {
            System.out.print("odd");
        }
        else {
            System.out.print("even");
        }    
    }
}
