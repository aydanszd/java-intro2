public class task9 {
    public static void main(String[] args) {
        // A
        System.out.println("A:");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // B
        System.out.println("B:");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}