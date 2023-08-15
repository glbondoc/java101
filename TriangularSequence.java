public class TriangularSequence {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;

        System.out.println(a);

        for (int i = 1; i < 9; i++) {
            c = a + b;
            System.out.println(c);
            a = c;
            b = b + 1;
        }
    }
}
