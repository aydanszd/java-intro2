import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter the height of the tree (N): ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive number!");
            }
        } while (n <= 0);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}