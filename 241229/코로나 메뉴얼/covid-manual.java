import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String flu_a = sc.next();
        int a = sc.nextInt();
        String flu_b = sc.next();
        int b = sc.nextInt();
        String flu_c = sc.next();
        int c = sc.nextInt();

        if (a >= 37) {
            if(flu_a.equals("Y")){
                if(b < 37 && c < 37) {
                    System.out.print("N");
                }
                else if (flu_b.equals("N") && flu_c.equals("N")) {
                    System.out.print("N");
                }
                else {
                    System.out.print("E");
                }
            }
            else {
                if(flu_b.equals("Y") && flu_c.equals("Y")) {
                    System.out.print("E");
                }
                else {
                    System.out.print("N");
                }
            }
        }
        else if(a < 37) {
            if(flu_b.equals("Y") && flu_c.equals("Y")) {
                if ( b >=37 && c >= 37) {
                    System.out.print("E");
                }
                else {
                    System.out.print("N");
                }
            }
            else {
                System.out.print("N");
            }

        }
    }
}