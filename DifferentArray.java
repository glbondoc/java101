public class DifferentArray {
    public static void main(String[] args) {
        // Single-Dimensional Array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Single-Dimensional Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Multidimensional Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Multidimensional Array:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Jagged Array
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        System.out.println("Jagged Array:");
        for (int[] row : jaggedArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Array of Objects
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("Array of Objects:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
