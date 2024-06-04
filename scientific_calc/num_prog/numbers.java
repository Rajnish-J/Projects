import java.util.*;

class math{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        Long num = sc.nextLong();

        while(num>0){
            System.out.println(num);
            num /= 10;
        }
    }
}