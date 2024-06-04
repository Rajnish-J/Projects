package String;
class vowels{
    public static void main(String[] args) {
        String name = "Code with Rajnish";
        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i<name.length();i++){
            char c = name.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u' || c == 'A' || c == 'E' || c == 'I'|| c == 'O' || c == 'U'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("The given " + name + " contain "+ vowels + " vowels " + consonants + " consonants.");
    }
}