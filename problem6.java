import java.util.Scanner;

public class problem6 {
    // Complexity: linear - O(N)
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
    // Complexity: linear - O(N)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(power(a, n)); 
        scanner.close();
}
}
