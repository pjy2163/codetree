import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sex = sc.nextInt();
        int age = sc.nextInt();

        if (sex == 0) {
            if (age >= 19) {
                System.out.println("MAN");
            }
            else {
                System.out.println("BOY");
            }   
        }
        else if (sex == 1 && age >=19) {
            System.out.print("WOMAN");
        }
        else {
            System.out.print("GIRL");
        }
        
    }
}