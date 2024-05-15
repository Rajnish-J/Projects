import java.util.*;
class aadharDriver {
    static Scanner sc = new Scanner(System.in);
    static int t = 0;

    static aadhar[] arr = {
        aadhar.getaadharObj("Rajnish", 9176960600L, "Chennai", 123456789012L),
        aadhar.getaadharObj("Jaisankar", 9841893116L, "Chennai", 123456789452L),
        aadhar.getaadharObj("Leena kumari", 9171130111L, "Chennai", 123445789012L),
        aadhar.getaadharObj("Hemasri", 7200310933L, "Chennai", 123456745012L),
    };

    public static void main(String[] args) throws Exception {
        home();
    }

    //user array methods
    public static int user_details(){
        int i = 0;
        for(i = 0; i< arr.length; i++){
            long Check = arr[i].getContact();int ret = 0;
            System.out.print("Enter the registered mobile no: ");
            long user_no = sc.nextLong();
            if( Check == user_no){
                ret = i;
                System.out.println("Login Succesful");
            }
            
        }
        return i;
    }

    //home method
    public static void home() throws Exception{
        boolean repeat_home_page = true;
        do{
            System.out.println("Welcome to the aadhar portal: ");
            System.out.println();
            System.out.println("you can get services on:");
            System.out.println();
            System.out.println("1. Getting Information\n2. Updating Information\n3. Exit");
            Thread.sleep(1000);
            int t = user_details();
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
            System.out.println();System.out.println("Welcome to the getter page: ");System.out.println();
            System.out.println("you can get services on: ");System.out.println();
            System.out.println("1. Get Name\n2. Get Contact\n3. Get Address\n4. Get aadhar_no\n5. Exit");
            System.out.println();
            Thread.sleep(1000);
            System.out.println();

            System.out.print("Enter the number to get services: ");
            int input = sc.nextInt();

            switch (input) {
                case 1: {
                    System.out.println("Name: " + arr[t].getname());Thread.sleep(2000);
                    System.out.println("Returning to the Get page....:)");Thread.sleep(1500);
                    break;
                }
                case 2: {
                    System.out.println("Contact No: " + arr[t].getContact());Thread.sleep(2000);
                    System.out.println("Returning to the Get page....:)");Thread.sleep(1500);
                    break;
                }
                case 3: {
                    System.out.println("Address: " + arr[t].getAddress());Thread.sleep(2000);
                    System.out.println("Returning to the Get page....:)");Thread.sleep(1500);
                    break;
                }
                case 4: {
                    System.out.println("Aadhar No: " + arr[t].getaadhar_no());Thread.sleep(2000);
                    System.out.println("Returning to the Get page....:)");Thread.sleep(1500);
                    break;
                }
                case 5: {
                    repeat_get_page = false;
                    System.out.println("Thank you for visiting User fetching page... you are redirecting to home page.... :)");
                    System.out.println();
                    break;
                }
            }
        }
        while(repeat_get_page);
    }

    public static void setPage()throws Exception{
        boolean repeat_set_page = true;
        do{
            System.out.println("Welcome to the aadhar details update portal: ");System.out.println();
            System.out.println("you can get services on: ");System.out.println();
            System.out.println("1. update Name\n2. update Contact\n3. update Address\n4. Exit");
            Thread.sleep(1000);

            System.out.print("Enter the number to get services: ");
            int input = sc.nextInt();

            switch (input) {
                case 1: {
                    System.out.print("Enter the name to update: ");
                    String newName = sc.next();
                    arr[2].setName(newName);Thread.sleep(2000);
                    System.out.println("Returning to the Update page....:)");Thread.sleep(1500);
                    break;
                }
                case 2: {
                    System.out.print("Enter the Contact to update: ");
                    long newcontact = sc.nextLong();
                    arr[3].setContact(newcontact);Thread.sleep(2000);
                    System.out.println("Returning to the Update page....:)");Thread.sleep(1500);
                    break;
                }
                case 3: {
                    System.out.print("Enter the address to update: ");
                    String newaddress = sc.nextLine();
                    arr[0].setaddress(newaddress);Thread.sleep(2000);
                    System.out.println("Returning to the Update page....:)");Thread.sleep(1500);
                    break;
                }
                case 4: {
                    repeat_set_page = false;
                    System.out.println("Thank you for visiting User Updating page... you are redirecting to home page.... :)");System.out.println();
                    break;
                }
            }
        }
        while(repeat_set_page);
    }
}