package package1;

public class StudentObj {
    String firstName, lastName, Course;
    int year;
    char section;
    float midtermGrade, finalGrade;

    StudentObj (String firstName, String lastName, String Course, int year, char section, float midtermGrade, float finalGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Course = Course;
        this.year = year;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }
    void intro(){
        System.out.println("I'm " + firstName + " " + lastName);
        System.out.println("My course is " + Course);
        System.out.println("I'm " + year + "st year college");
        
        System.out.println("from section " + section);
    }
    void evaluateGrade(){
        float average= (midtermGrade + finalGrade) / 2;
        System.out.println("Average: " + average);
        
        if (average >= 98) {
            System.out.println("You're with Highest Honor!");
        } else if (average >= 95) {
            System.out.println("You're with High Honor!");
        } else if (average >= 90) {
            System.out.println ("You're with Honor!");
        } else {
            System.out.println("You're Passed!");
        }
        

    }
}
