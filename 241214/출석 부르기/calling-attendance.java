import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number == 1) {
            System.out.print("John");
        }
        else if (number == 2) {
            System.out.print("Tom");
        }
        else if (number == 3) {
            System.out.print("Paul");
        }
        else {
            System.out.print("Vacancy");
        }
    }
}