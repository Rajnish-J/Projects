import java.util.*;

class Investement {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter the Fixed amount: ");
        double p = sc.nextDouble();
        System.out.print("Please enter the duration of deposit in years: ");
        int n = sc.nextInt();
        System.out.print("is interest cumulative or simple?");
        String res = sc.next();
        InterestCalculator calc;

        if(res.equalsIgnoreCase("cumulative")){
            calc = new SimpleInterest();
        }
        else{
            calc = new CompoundInterest();
        }
        double r = 6.5;
        System.out.println("The principal amount " + p);
        double interest = calc.calculateInterest(p, n, r);

        System.out.println("Interest " + interest);
        System.out.println("Principal amount: " + p);
        System.out.println("Intetest rate: " + r + "%");
        System.out.println("Duration: " + n + " years");
    }    
}
