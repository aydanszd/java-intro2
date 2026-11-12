import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int secret = 7;
        int guess;

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess == secret) {
                System.out.println("Congratulations!");
            } else {
                System.out.println("Try again!");
            }
        } while (guess != secret);

    }
}