import java.util.*;

class swiggy{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\t\t\tselect the hotel u want");
        System.out.println("1. Buhari\n2. S.S.Hyderabad\n3.Al-safa\n4.Eats-of-arabs");
        System.out.print("Enter the hotel number: ");
        int hotel = sc.nextInt();
        switch(hotel){
            case 1:{
                System.out.println("Welcome to Buhari");
                System.out.println("\t\t\tselect the food u want");
                System.out.println("1. Chicken Biriyani\n2. Mutton Biriyani\n3.Chicken 65");
                System.out.print("Enter the receipe number: ");
                int receipe = sc.nextInt();
                switch (receipe) {
                    case 1:{
                        System.out.print("Enter the quantity :");
                        int qty = sc.nextInt();
                        int C_B = qty * 150;
                        System.out.println("your bill is: " + C_B);
                        break;
                    }
                    case 2:{
                        System.out.print("Enter the quantity :");
                        int qty = sc.nextInt();
                        int M_B = qty * 250;
                        System.out.println("your bill is: " + M_B);
                        break;
                    }
                    case 3:{
                        System.out.print("Enter the quantity :");
                        int qty = sc.nextInt();
                        int C_65 = qty * 80;
                        System.out.println("your bill is: " + C_65);
                        break;
                    }
                    default:{
                        System.out.println("Invalid choice, choose correct option");
                        break;
                    }
                }
                break;
            }
            case 2:{
                System.out.println("S.S.Hyderbad");
                System.out.println("\t\t\tselect the food u want");
                System.out.println("1. Chicken Biriyani\n2. Mutton Biriyani\n3.Chicken 65");
                System.out.print("Enter the receipe number: ");
                int receipe = sc.nextInt();
                switch (receipe) {
                    case 1:{
                        System.out.print("Enter the quantity :");
                        int qty = sc.nextInt();
                        int C_B = qty * 180;
                        System.out.println("your bill is: " + C_B);
                        break;
                    }
                    case 2:{
                        System.out.print("Enter the quantity :");
                        int qty = sc.nextInt();
                        int M_B = qty * 280;
                        System.out.println("your bill is: " + M_B);
                        break;
                    }
                    case 3:{
                        System.out.print("Enter the quantity :");
                        int qty = sc.nextInt();
                        int C_65 = qty * 120;
                        System.out.println("your bill is: " + C_65);
                        break;
                    }
                    default:{
                        System.out.println("Invalid choice, choose correct option");
                        break;
                    }
                }
                break;
            }
            case 3:{
                System.out.println("Al-Safa");
                System.out.println("\t\t\tselect the food u want");
                System.out.println("1. Chicken Biriyani\n2. Mutton Biriyani\n3.Chicken 65");
                System.out.print("Enter the receipe number: ");
                int receipe = sc.nextInt();
                switch (receipe) {
                    case 1:{
                        System.out.print("Enter the quantity :");
                        int qty = sc.nextInt();
                        int C_B = qty * 250;
                        System.out.println("your bill is: " + C_B);
                        break;
                    }
                    case 2:{
                        System.out.print("Enter the quantity :");
                        int qty = sc.nextInt();
                        int M_B = qty * 280;
                        System.out.println("your bill is: " + M_B);
                        break;
                    }
                    case 3:{
                        System.out.print("Enter the quantity :");
                        int qty = sc.nextInt();
                        int C_65 = qty * 120;
                        System.out.println("your bill is: " + C_65);
                        break;
                    }
                    default:{
                        System.out.println("Invalid choice, choose correct option");
                        break;
                    }
                }
                break;
            }
            case 4:{
                System.out.println("Eats_of_Arabs");
                System.out.println("\t\t\tselect the food u want");
                System.out.println("1. Chicken Biriyani\n2. Mutton Biriyani\n3.Chicken 65");
                System.out.print("Enter the receipe number: ");
                int receipe = sc.nextInt();
                switch (receipe) {
                    case 1:{
                        System.out.print("Enter the quantity :");
                        int qty = sc.nextInt();
                        int C_B = qty * 160;
                        System.out.println("your bill is: " + C_B);
                        break;
                    }
                    case 2:{
                        System.out.print("Enter the quantity :");
                        int qty = sc.nextInt();
                        int M_B = qty * 260;
                        System.out.println("your bill is: " + M_B);
                        break;
                    }
                    case 3:{
                        System.out.print("Enter the quantity :");
                        int qty = sc.nextInt();
                        int C_65 = qty * 90;
                        System.out.println("your bill is: " + C_65);
                        break;
                    }
                    default:{
                        System.out.println("Invalid choice, choose correct option");
                        break;
                    }
                }
                break;
            }
        }
        System.out.println("\t\t\tEnter your payment");
        System.out.println("1.Google pay\n2.phone pay");
        System.out.print("Enter the mode: ");
        int mode = sc.nextInt();
        System.out.println("OTP generated to your respective account....");
        int otp = (int)(Math.random()*9999+9999);
        System.out.println(otp);
        System.out.print("Enter your OTP: ");
        int user_otp = sc.nextInt();

        String res = ((otp == user_otp) ? "Verified" : "Wrong OTP, Enter correct OTP...");
        if(res == "Verified"){
            System.out.println("Payment done");
        }
        if(res == "Wrong OTP, Enter correct OTP..."){
            System.out.println("Wrong OTP");
        }
    }
}