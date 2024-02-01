import java.util.*;

class calculator{
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
    static void semester_one(){
        System.out.println(5+3);

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
