import java.util.*;

class arr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // getting user input
        int size = sc.nextInt();
        // intilizing array
        int[] arr_1 = new int[size];
        // getting array values
        for (int i = 0;i <arr_1.length; i++){
            arr_1[i] = sc.nextInt();
        }
        // initilizing varibles to count sum of even and odd numbers
        int count_even = 0;
        int count_odd = 0;

        // checking the array indexes are even or odd
        for(int i = 0; i<arr_1.length; i++){
            if(arr_1[i] % 2 == 0){
                count_even += arr_1[i];
            }
            else{
                count_odd += arr_1[i];
            }
        }
        
        // getting final result 
        System.out.println(count_even -  count_odd);

    }    
}