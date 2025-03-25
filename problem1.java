import java.util.Scanner;

public class problem1 {
    // Complexity: linear - O(N)
    public static int min(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        int RecursiveMin = min(arr, i + 1);
        if (arr[i] < RecursiveMin) {
            return arr[i];
        } else {
            return RecursiveMin;
        }
    }
    // Complexity: linear - O(N)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = min(arr, 0);
        System.out.println(result);
        scanner.close();
    }
}
