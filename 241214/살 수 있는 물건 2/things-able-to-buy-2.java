import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        if (money >= 3000) {
            System.out.print("book");
        }
        else if (money > 501) {
            System.out.print("pen");
        }
        else if (money > 1001) {
            System.out.print("mask");
        }
        else {
            System.out.print("no");
        }
    }
}