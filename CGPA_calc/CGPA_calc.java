import java.util.Scanner;

class AnnaUniversityCGPACalculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Anna University CGPA and GPA Calculator");
        System.out.println("Choose an option:");
        System.out.println("1. Calculate CGPA");
        System.out.println("2. Calculate Semester GPA");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                calculateCGPA();
                break;
            case 2:
                calculateSemesterGPA();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    static void calculateCGPA() {
        System.out.print("Enter the number of semesters: ");
        int numSemesters = sc.nextInt();
        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 1; i <= numSemesters; i++) {
            System.out.println("Enter details for Semester " + i);
            double semesterGPA = calculateSemesterGPA();
            System.out.print("Enter credits for Semester " + i + ": ");
            double credits = sc.nextDouble();
            totalCredits += credits;
            totalGradePoints += semesterGPA * credits;
        }

        double cgpa = totalGradePoints / totalCredits;
        System.out.println("Your CGPA is: " + cgpa);
    }

    static double calculateSemesterGPA() {
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter details for Subject " + i);
            System.out.print("Enter grade (O, A+, A, B+, B): ");
            double gradePoints = getGradePoints(sc.next());
            System.out.print("Enter credits for Subject " + i + ": ");
            double credits = sc.nextDouble();
            totalCredits += credits;
            totalGradePoints += gradePoints * credits;
        }

        double gpa = totalGradePoints / totalCredits;
        System.out.println("Your Semester GPA is: " + gpa);
        return gpa;
    }

    static double getGradePoints(String grade) {
        switch (grade.toUpperCase()) {
            case "O":
                return 10;
            case "A+":
                return 9;
            case "A":
                return 8;
            case "B+":
                return 7;
            case "B":
                return 6;
            default:
                System.out.println("Invalid grade entered");
                return 0;
        }
    }
}
