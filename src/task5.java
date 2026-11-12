import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "java123";
        int tries = 0;
        boolean ok = false;

        while (tries < 3 && !ok) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();

            if (input.equals(password)) {
                System.out.println("Access granted!");
                ok = true;
            } else {
                System.out.println("Wrong password!");
                tries++;
            }
        }

        if (!ok) {
            System.out.println("Account locked!");
        }

        sc.close();
    }
}