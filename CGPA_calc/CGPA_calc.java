import java.util.*;

class calculator{
    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the semester number to check gpa: ");
            int semester = sc.nextInt();
            switch (semester) {
                case 1:
                    semester_one();
                    break;
                case 2:
                    semester_two();
                    break;
                case 3:
                    semester_three();
                    break;
                case 4:
                    semester_four();
                    break;
                case 5:
                    semester_five();
                    break;
                case 6:
                    semester_six();
                    break;
                case 7:
                    semester_seven();
                    break;
                case 8:
                    semester_eight();
                    break;    
                default:
                    System.out.println("Enter the correct semester number");
                    break;
                }
            }
        
        static void check_grade(){
            Scanner sc = new Scanner(System.in);
            int marks = 0;
            String grade = sc.nextLine();
            switch (grade) {
                case "O":
                    marks = 10;
                    break;
                
                case "A+":
                    marks = 9;
                    break;
            
                case "A":
                    marks = 8;
                    break;

                case "B+":
                    marks = 7;
                    break;

                case "B":
                    marks = 6;
                    break;
                
                default:
                    System.out.println("Enter the correct grade!!!");
                    break;
            }
        }
        
        static void semester_one(){
            int gpa = 0;
            int count = 0;
            System.out.print("Enter Engg phys: ");
            check_grade();
            System.out.print("Enter engg chem: ");
            check_grade();

        }
        static void semester_two(){

        }
        static void semester_three(){

        }
        static void semester_four(){

        }
        static void semester_five(){

        }
        static void semester_six(){

        }
        static void semester_seven(){

        }
        static void semester_eight(){

        }
    }
