import java.util.Scanner;

public class problem5 {
    // Complexity: exponential - O(2^N)
    public static int fibonacci(int n) {
    if ( n == 0 || n == 1) return n;
    return fibonacci(n-2) + fibonacci(n-1);
}
// Complexity: exponential - O(2^N)
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(fibonacci(n));
    scanner.close();
}
}
