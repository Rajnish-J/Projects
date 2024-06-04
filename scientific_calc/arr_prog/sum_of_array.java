public class sum_of_array {
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5};
        int a = array.length;
        int sum = 0;

        for (int i = 0; i<a; i++){
            sum += array[i];
        }
        System.out.println(sum);
    }    
}