import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();

        System.out.println("Even numbers:");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        int evenCount = n / 2;
        int oddCount = n - evenCount;
        System.out.println("\nEven count: " + evenCount);
        System.out.println("Odd count: " + oddCount);

        input.close();
    }
}