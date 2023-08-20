public class DifferentLoops {
    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        // While Loop
        System.out.println("While Loop:");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println();

        // Do-While Loop
        System.out.println("Do-While Loop:");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        System.out.println();

        // Enhanced For Loop (for-each)
        System.out.println("Enhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println();

        // Nested Loop
        System.out.println("Nested Loop:");
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                System.out.print(x * y + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Loop with Break Statement
        System.out.println("Loop with Break:");
        for (int j = 1; j <= 10; j++) {
            if (j == 6) {
                break;
            }
            System.out.println(j);
        }
        System.out.println();

        // Loop with Continue Statement
        System.out.println("Loop with Continue:");
        for (int k = 1; k <= 10; k++) {
            if (k % 2 == 0) {
                continue;
            }
            System.out.println(k);
        }
    }
}
