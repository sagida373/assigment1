import java.util.Scanner;

public class problem8 {
    // Complexity: linear - O(N)
    public static boolean digits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return digits(s, i + 1);
    }
    // Complexity: linear - O(N)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean result = digits(input, 0);
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
