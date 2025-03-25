import java.util.Scanner;

public class problem3 {
    // Complexity: sublinear - O(√N)
    public static boolean prime(int n, int divisor) {
        if (n <= 1) return false;
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;
        return prime(n, divisor + 1);
    }
    // Complexity: constant - O(1)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (prime(n, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
            scanner.close();
        }
    }
}