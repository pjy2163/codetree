import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[] countArr = new int[5];
        String[] cold = new String[3];
        int[] temp = new int[3];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;


        for (int i = 0; i < 3; i++) {
            cold[i] = sc.next();
            temp[i] = sc.nextInt();
            
            if(cold[i].equals("Y") && temp[i] >= 37) {
                a++;
            }
            else if(cold[i].equals("N") && temp[i] >= 37) {
                b++;
            }
            else if(cold[i].equals("Y") && temp[i] < 37) {
                c++;
            }
            else if(cold[i].equals("N") && temp[i] < 37) {
                d++;
            }
        }
        System.out.print(a + " " + b + " " + c + " " + d);
        if (a >= 2) {
            System.out.print(" E");
        }
    }
}