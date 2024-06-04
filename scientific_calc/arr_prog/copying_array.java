import java.util.*;
class copying_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] num_1 = new int[size];
        int [] num_2 = new int[size];

        for(int i = 0; i<size; i++){
            num_1[i] = sc.nextInt();
        }

        for(int j = 0; j<size; j++){
            num_2[j] = num_1[j];
            System.out.println(num_2[j]);
        }
    }
}
