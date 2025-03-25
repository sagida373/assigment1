import java.util.Scanner;

public class problem9 {
    // Complexity: exponential - O(2^N)
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }
    // Complexity: exponential - O(2^N)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(binomial(n, k));
        scanner.close();
    }
}