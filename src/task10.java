import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid number!");
        } else {
            String str = "" + num;
            int sum = 0;
            int mult = 1;
            String rev = "";

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int d = c - '0';

                sum = sum + d;
                mult = mult * d;
                rev = c + rev;
            }

            System.out.println("Digits count: " + str.length());
            System.out.println("Sum of digits: " + sum);
            System.out.println("Product of digits: " + mult);
            System.out.println("Reverse: " + rev);
        }
    }
}