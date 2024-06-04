package String;
import java.util.*;

class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String done = reversesentence(str);
        System.out.println(done);
    }

    public static String reversesentence(String Sentence){
        String[] words = Sentence.split(" ");

        StringBuilder reversed = new StringBuilder();
        for(int i = words.length - 1; i>=0 ; i--){
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}