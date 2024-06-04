package String;
class Manipulation {
    public static void main(String[] args) {
        String s1 = "Hello Sri";
        String s2 = "everyone, this is";

        String[] arr = s1.split(" ");
        String output = "";

        for (int i = 0; i < arr.length; i++) {
            output += arr[i] + " ";
        }

        output += s2;
        System.out.println(output.trim());
    }
}
