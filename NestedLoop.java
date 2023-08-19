public class NestedLoop {
    public static void main(String[] args) {
        int limit = 10;
        
        for (int number = 2; number <= 10; number++) {
            System.out.println("Multiplication Table for " + number);
            System.out.println("------------------------");
            
            for (int i = 1; i <= limit; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }
            
            System.out.println();
        }
    }
}