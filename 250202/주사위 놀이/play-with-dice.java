import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[] countArr = new int[10];
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
                countArr[arr[i]]++;
            }
        for (int i = 1; i < 7; i++) {
            System.out.println(i + " - " + countArr[i]);
        }
    }
}
