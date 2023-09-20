import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        try {
            System.out.println("Enter size of array:");
            n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements of array");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();

                if (arr[i] == 100) {
                    System.out.println("Array elements have been entered");
                    for (int j = 0; j < i; j++) {
                        System.out.print(arr[j]+"   ");
                    }
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}