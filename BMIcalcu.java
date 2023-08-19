import java.util.Scanner;

public class BMIcalcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Getting age from the user
        System.out.print("Enter your age: ");
        double age = scanner.nextDouble();

        System.out.print("Enter your weight(kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height(m): ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Determine BMI category
        String category = determineBMICategory(bmi);

        // Output
        System.out.println("Your BMI: " + bmi);
        System.out.println("Category: " + category);

        // Close the scanner
        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        // BMI formula: weight (kg) / (height (m) * height (m))
        return weight / (height * height);
    }

    public static String determineBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}