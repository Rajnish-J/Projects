package String;

import java.util.*;

class even_length{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        even_lengths(input);
    }
    public static void even_lengths(String sentence){
        String[] word = sentence.split(" ");
        for(String words: word){
            if(words.length() % 2 == 0){
                System.out.println(words);
            }
        }
    }
}