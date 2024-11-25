public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        a = a + b + c;
        c = b = a;
        System.out.printf("%d %d %d",a,b,c);
    }
}