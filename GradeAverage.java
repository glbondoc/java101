import java.util.Scanner;
public class GradeAverage {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.print("Enter your 1st semester Grade: ");
        int grade= s.nextInt ();
        System.out.print("Enter your 2nd semester Grade: ");
        int grade1= s.nextInt ();
        System.out.print("Enter your 3rd semester Grade: ");
        int grade2= s.nextInt ();
        System.out.print("Enter your 4th semester Grade: ");
        int grade3= s.nextInt ();
        System.out.print("Enter Symbol: ");
        char symbol= s.next().charAt(0);
        int result= 0;

        // can also remove int result, switch (symbol), and double average. Use this instead:
        // int average= (grade + grade1 + grade2 + grade3) / 4;
        // then System.out.println("Your General Average is: " + average);
        switch (symbol) {
            case '+': result= grade+grade1+grade2+grade3;
            break;

            default:
            System.out.println("Invalid symbol");
            return;
        }
         
        double average = (double) result / 4;
        System.out.println("Your General Average is: " + average);

        if (average >= 98) {
            System.out.println("You're with Highest Honor!");
        } else if (average >= 95) {
            System.out.println("You're with High Honor!");
        } else if (average >= 90) {
            System.out.println ("You're with Honor!");
        } else {
            System.out.println("You're Passed!");
        }

        s.close(); // Close the Scanner
    }
}