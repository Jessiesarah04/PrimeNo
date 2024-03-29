import java.util.Scanner;

public class Fibonacciseries1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci(i) + " ");
        }

        sc.close();
    }
    static int Fibonacci(int n){
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
}
}