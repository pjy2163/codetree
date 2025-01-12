import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int ga = sc.nextInt();
            int se = sc.nextInt();
            String c = sc.next();

            System.out.println(ga*se);

            if(c.equals("C")) {
                break;
            }
            else {
                continue;
            }
        }
    }
}