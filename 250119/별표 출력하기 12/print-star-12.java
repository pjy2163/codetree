import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        for(int i = 0 ; i<n; i++){
            
            for(int j=0; j<n; j++){
            if( (i>0&&j%2==0) || j<i){
                System.out.print("  ");
                
            }
            else if( i==0 || (j%2==1)  ) {
                System.out.print("* ");
            }
            }
        System.out.println();
        }
    }
}