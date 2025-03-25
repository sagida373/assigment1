import java.util.Scanner;

public class problem10 {
    // Complexity: logarithmic - O(log(min(a, b)))
    public static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
    // Complexity: logarithmic - O(log(min(a, b)))
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(GCD(a , b));
        scanner.close();
    }
}
