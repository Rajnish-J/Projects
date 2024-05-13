import java.util.*;

class portal_driver {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    }

    // home page
    public static void home()throws Exception{
        
        System.out.println("Welcome to the college portal...");
        System.out.println("Here you can get your updates and modify your detials");
        System.out.println("1. Get Info\n2. uodate Info\n3. Exit");

        boolean home_repeat = true;
        do{
            System.out.print("Enter the number of the choice: ");
            int input = sc.nextInt();
            switch (input) {
                case 1:{
                    getPage();
                    break;
                }

                case 2:{
                    setPage();
                    break;
                }

                case 3:{
                    System.out.println("Thank you for visiting college portal....");
                    home_repeat = false;
                    break;
                }
            }
        }
        while(home_repeat);
    }
    
    // getpage
    public static void getPage()throws Exception{
        
        System.out.println("Here you can get your updates your detials");
        System.out.println("1. Name\n2. Regno\n3. Contact no\n4. Location\n5. Mail_ID");

        boolean getPage_repeat = true;
        do{
            System.out.print("Enter the number of the choice: ");
            int input = sc.nextInt();
            switch (input) {
                case 1:{
                    System.out.println();
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    break;
                }
            }
        }
        while(getPage_repeat);

    }

    //setPage
    public static void setPage() throws Exception{
        System.out.println("Welcome to the college portal...");
        System.out.println("Here you can get your updates and modify your detials");
        System.out.println("1. Name\n2. Regno\n3. Contact no\n4. Location\n5. Mail_ID");

        boolean home_repeat = true;
        do{
            System.out.print("Enter the number of the choice: ");
            int input = sc.nextInt();
            switch (input) {
                case 1:{
                    
                    break;
                }
                default:
                    break;
            }
        }
        while(home_repeat);
        
    }
}
