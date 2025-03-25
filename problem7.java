import java.util.Scanner;

public class problem7 {
    // Complexity: super-exponential - O(N × N!)
    public static void permutations(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permutations(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }
    // Complexity: linear - O(N)
    public static String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
        }
     // Complexity: linear - O(N) 
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = input.length();
        permutations(input, 0, n - 1);
        scanner.close();
        }
}