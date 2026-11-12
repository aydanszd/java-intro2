import java.util.Scanner;public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

        // B
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.println(a + " x " + b + " = " + a * b);
            }
            System.out.println();
        }
    }
}