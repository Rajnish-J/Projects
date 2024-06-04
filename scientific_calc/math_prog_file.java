import java.util.*;

class math_prog_file {
    static Scanner sc = new Scanner(System.in);

    //Anagram method
    public String anagram(){
        System.out.print("Enter the first word");
        String name_1 = sc.nextLine();
        System.out.print("Enter the Second word");
        String name_2 = sc.nextLine();

        // converting the strings into lower case
        name_1.toLowerCase();
        name_2.toLowerCase();

        // changing strings to char array:
        char[] char_1 = name_1.toCharArray();
        char[] char_2 = name_2.toCharArray();

        // sorting
        Arrays.sort(char_1);
        Arrays.sort(char_2);

        //checking for anagram
        String res = (Arrays.equals(char_1, char_2) ? "Anagram" : "Not an anagram");

        return res;
    }

    //Armstrong number method
    public String armstrong_num(){
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int original_number, remainder, result = 0;
        int num_of_digits = 0;

        original_number = num;

        while(original_number > 0 ){
            original_number /= 10;
            num_of_digits++;
        }

        original_number = num;

        while(original_number > 0 ){
            remainder = original_number % 10;
            result += Math.pow(remainder,num_of_digits);
            original_number /= 10;
            
        }
        String res = ((result == num)? "Armstrong Number" : "Not a Armstrong Number");

        return res;
    }
    
    //count Integer method
    public int count_num(){
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        
        if(num<0){
            num = - num;
        }

        while(num>0){
            num = num / 10;
            count ++;
        }
        
        return count;
    }

    // Factorial method
    public long factorial(){
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        long factorial = 1;

        for(int i = 1; i<=num; i++){
            factorial *= i;
        }
        return factorial;
    }

    //Factors method
    public void factors(){
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for(int i = 2; i< num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    //Fibonacci method
    public void fibonacci(){
        System.out.print("Enter the size of fibonacci series: ");
        int num = sc.nextInt() - 1;
        int next_term = 0;
        int first_term = 0;
        int second_term = 1;
        System.out.print(first_term + " ");
        while(num-- > 0){
            next_term = first_term + second_term;
            System.out.print(next_term + " ");
            first_term = second_term;
            second_term = next_term;
        }
    }

    //GCD method
    public int GCD(){
        System.out.print("Enter the first number: ");
        int num_1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num_2 = sc.nextInt();
        int small = Math.min(num_1, num_2);
        int gcd = 1;

        for(int i = small; i>= 1; i--){
            if((num_1 % i == 0) && (num_2 % i == 0)){
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    //LCM method
    public int LCM(){
        System.out.print("Enter the first number: ");int num_1 = sc.nextInt();
        System.out.print("Enter the Second number: ");int num_2 = sc.nextInt();
        int small = Math.min(num_1, num_2);
        int gcd = 1;
        int lcm = 1;
        
        for(int i = small; i>=1; i--){
            if((num_1%i == 0)&&(num_2%i == 0)){
                gcd = i;
                break;
            }
            
        }
        lcm = (num_1 * num_2) / gcd;
        
        return lcm;
    }

    // Leap Year method
    public String leap_year(){
        System.out.print("Enter the year to check: ");
        int year = sc.nextInt();
        String res;

        if((year%400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            res = "Leap year";
        }
        else{
            res = "Not a leap year";
        }
        return res;
    }

    //ODD or EVEN method
    public String even_odd(){
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        String[] arr = new String[]{"even","odd"};
        return(arr[num & 1]);
    }

    //Palindrome method
    public String palindrome(){
        System.out.print("Enter the word: ");
        String str = sc.nextLine();
        boolean check = false;

        int i = 0;
        int j = str.length() - 1;

        while(i++ < j--){
            if(str.charAt(i) != str.charAt(j)){
                check = false;
                break;
            }
            else{
                check = true;
            }
        }
        String res = (check? "palindrome" : "not a palindrome");
    
        return res;
    }

    //Power method
    public int power(){
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        int pow = 1;

        for(int i = 0; i<power; i++){
            pow *= base;
        }
        return pow;
    }

    //Prime number check method
    public String prime_or_not(){
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int flag = 0;
        String res;

        if(num == 2){
            res = "Prime number";
        }
        else if(num % 2 == 0 || num == 1){
            res = "Not a prime number";
        }
        else{
            for(int i = 2; i * i<num; i++){
                if (num%i == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                res = "Prime number";
            }
            else{
                res = "Not a prime number";
            }
        }
        return res;
    }

    //Reverse method
    public long reverseNumber(){
        System.out.print("Enter the number: ");
        long num = sc.nextInt();

        long reverseNumber = 0;

        while(num != 0){
            long digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num /= 10;
        }
        return reverseNumber;
    }

    //Sum of natural number
    public int SumOfNaturalNum(){
        int n = sc.nextInt();
        int res = (n * (n+1)) / 2;
        return res;
    }    
}