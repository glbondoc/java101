public class ForLoop {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;

        System.out.println(a); 

        for (int i = 1; i < 7; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}

