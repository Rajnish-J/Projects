import java.util.*;
class aadharDriver {
    static Scanner sc = new Scanner(System.in);

    static aadhar aadhar_1 = aadhar.getaadharObj("Rajnish", 9176960600L, "Chennai", 123456789012L);

    public static void main(String[] args) throws Exception {
        home();
    }

    //home method
    public static void home() throws Exception{
        boolean repeat_home_page = true;
        do{
            System.out.println("Welcome to the aadhar portal: ");
            System.out.println("you can get services on 1. Getting information/n2. Updating information/n3. Exit");
            Thread.sleep(1000);
            System.out.println();

            System.out.print("Enter the number to get services: ");
            int input = sc.nextInt();

            switch (input) {
                case 1: {
                    getPage();
                    break;
                }
                case 2: {
                    setPage();
                    break;
                }
                case 3: {
                    repeat_home_page = false;
                    System.out.println("Thank you for the visiting aadhar portal.... :) ");
                    break;
                }
            }

        }
        while(repeat_home_page);
    }

    //getting methods
    public static void getPage() throws Exception{
        boolean repeat_get_page = true;
        do{
            System.out.println("Welcome to the getter page: ");
            System.out.println();
            System.out.println("you can get services on 1. Get Name/n2. Get Contact/n3. Get Address/n 4. Get aadhar_no");
            System.out.println();
            Thread.sleep(1000);
            System.out.println();

            System.out.print("Enter the number to get services: ");
            int input = sc.nextInt();

            switch (input) {
                case 1: {
                    System.out.println("Name: " + aadhar_1.getname());
                    break;
                }
                case 2: {
                    System.out.println("Contact No: " + aadhar_1.getContact());
                    break;
                }
                case 3: {
                    System.out.println("Address: " + aadhar_1.getAddress());
                    break;
                }
                case 4: {
                    System.out.println("Aadhar No: " + aadhar_1.getaadhar_no());
                    break;
                }
                case 5: {
                    repeat_get_page = false;
                    System.out.println("Thank you for visiting User fetching page... you are redirecting to home page.... :)");
                    break;
                }
            }
        }
        while(repeat_get_page);
    }

    public static void setPage()throws Exception{
        boolean repeat_set_page = true;
        do{
            System.out.println("Welcome to the aadhar details update portal: ");
            System.out.println();
            System.out.println("you can get services on 1. update Name/n2. update Contact/n3. update Address");
            System.out.println();
            Thread.sleep(1000);
            System.out.println();

            System.out.print("Enter the number to get services: ");
            int input = sc.nextInt();

            switch (input) {
                case 1: {
                    System.out.println("Enter the name to update: ");
                    String newName = sc.next();
                    aadhar_1.setName(newName);
                    break;
                }
                case 2: {
                    System.out.println("Enter the Contact to update: ");
                    long newcontact = sc.nextLong();
                    aadhar_1.setContact(newcontact);
                    break;
                }
                case 3: {
                    System.out.println("Enter the address to update: ");
                    String newaddress = sc.nextLine();
                    aadhar_1.setaddress(newaddress);
                    break;
                }
                case 4: {
                    repeat_set_page = false;
                    System.out.println("Thank you for visiting User Updating page... you are redirecting to home page.... :)");
                    break;
                }
            }
        }
        while(repeat_set_page);
    }
}
