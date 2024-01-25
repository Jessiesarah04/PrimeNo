import java.util.Scanner;

public class PrimeNumberinrange{
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int j = 2; j<=num/j; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int Start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();
    
        for (int i = Start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
