import java.util.Scanner;

public class FlowChartPseudoCode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer a = 1, b = 2, c = 3;
        a = b * c + 2;
        System.out.print("Enter number: ");
        Integer d = sc.nextInt();
        if (a == d) {
            ++c;
            System.out.println("yes \t" + c);
        } else {

            --c;
            System.out.println("no \t" + c);
            sc.close();
        }
    }
}