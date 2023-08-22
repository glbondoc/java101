/**
 * QuestwithLives
 */
import java.util.Scanner;
 public class QuestwithLives {
public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    int lives= 3;
    while (lives > 0) {
System.out.print("Who is the National Hero of the Philippines? ");
    String answer= s.nextLine();
    
    if (answer.equalsIgnoreCase("Jose Rizal")) break;
    else lives--;
    }
    if (lives > 0) System.out.println("You WON");
    else System.out.println("You LOST");

}
    
}