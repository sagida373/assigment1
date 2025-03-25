import java.util.Scanner;

public class problem4{
    // Complexity: linear - O(N)
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n -1);
    }
    // Complexity: constant - O(1)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}