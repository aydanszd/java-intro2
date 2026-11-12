import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number!");
        } else {
            while (n >= 0) {
                System.out.println(n);
                n--;
            }
            System.out.println("Salut!");
        }
    }
}