import java.util.Scanner;

public class problem2 {
    // Complexity: linear - O(N)
    public static int sum(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }
        return arr[i] + sum(arr, i + 1);
    }
    // Complexity: linear - O(N)
    public static double average(int[] arr) {
        int total = sum(arr, 0);
        return(double) total / arr.length;
    }
    // Complexity: linear - O(N)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        double avg = average(arr);
        System.out.println(avg);
        scanner.close();
    }
}
