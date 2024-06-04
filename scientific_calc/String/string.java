package String;
import java.util.*;
class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sent = sc.nextLine();

        String[] array = sent.split(" ");

        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }
}
