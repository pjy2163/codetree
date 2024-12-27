import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a < 6 && a > 2) {
            System.out.print("Spring");
        }
        else if (a < 9 && a > 5){
            System.out.print("Summer");
        }
        else if (a < 12 && a > 8){
            System.out.print("Fall");
        }
        else {
            System.out.print("Winter");
        }
    }
}