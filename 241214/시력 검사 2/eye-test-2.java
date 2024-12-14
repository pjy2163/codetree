import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        if (num >= 1.0) {
            System.out.print("High");
        }
        else if (num >= 0.5) {
            System.out.print("Middle");
        }
        else {
            System.out.print("Low");
        }
    }
}