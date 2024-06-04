import java.util.Scanner;

class largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int largest = 0;
        
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        //chcking loop
        for(int i = 0; i<size; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        System.out.println(largest);
    }
}