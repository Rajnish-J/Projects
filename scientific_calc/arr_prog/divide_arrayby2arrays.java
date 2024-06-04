import java.util.*;
class arr1_divide_arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] num_1 = new int[size];
        int [] num_2 = new int[size];

        for(int i = 0; i<size; i++){
            num_1[i] = sc.nextInt();
        }

        for(int i = 0; i<size; i++){
            num_2[i] = sc.nextInt();
        }

        for(int j = 0; j<size; j++){
            int num = num_1[j] / num_2[j];
            System.out.println(num);
        }
    }
}
