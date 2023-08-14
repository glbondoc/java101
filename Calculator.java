import java.util.Scanner;
public class Calculator {
        public static void main(String[] args) {
    
            Scanner s= new Scanner (System.in);
            System.out.print ("First number: ");
            float numOne= s.nextFloat();
            System.out.print ("Second number: ");
            float numTwo= s.nextFloat ();
            System.out.print ("Third number: ");
            float numThree= s.nextFloat ();
            System.out.print ("Enter symbol: ");
            char symbol= s.next ().charAt(0);
            
            float result = 0;
            
        switch (symbol) {
        case '+': result = numOne+numTwo+numThree;
        break;
        case '-': result = numOne-numTwo-numThree;
        break;
        case '*': result = numOne*numTwo*numThree;
        break;
        case '/': result = numOne/numTwo/numThree;
        break;
        }
        System.out.println (numOne + " " + numTwo + " " + numThree + "=" + result);
        }
    }
