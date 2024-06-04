import java.util.*;

class second_largest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        for(int j = 0; j < size; j++){
            Arrays.sort(array);
            if(j == array.length -2){
                int num = array[j];
                System.out.println(num);
            }
            
        }

    }
}
