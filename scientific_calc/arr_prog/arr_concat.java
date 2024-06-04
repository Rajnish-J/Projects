import java.util.*;
class arr1_concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String [] str_1 = new String[size];
        String [] str_2 = new String[size];

        for(int i = 0; i<size; i++){
            str_1[i] = sc.next();
        }

        for(int i = 0; i<size; i++){
            str_2[i] = sc.next();
        }

        for(int j = 0; j<size; j++){
            String str = str_1[j] + " " + str_2[j];
            System.out.print(str + " ");
        }
        
    }
}
