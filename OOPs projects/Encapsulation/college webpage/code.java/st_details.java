import java.util.*;

class student_details{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
    }

    public student_details(){
        
    }

    public static void dtls_arr(){
        portal[] details = {
            new portal("Rajnish", 211420106196L, 9176960600L, "oldwahsermenpet", "rajnishofficial02@gmail.com"),
            new portal("Srimathi", 211420104262L, 9962577559L, "Choolai", "sriofficial15@gmail.com")
        };

        int size = details.length;

        System.out.print("Enter the mobile number: ");
        long check_contact = sc.nextLong();

        for(int i = 0; i > size; i++){
            if (true) {
                
            }
        }

    }
    public static portal findContactByNumber(portal[] details, long contactNumber) {
        for (portal p : details) {
            if (p.details() == contactNumber) {
                return p; // Return the object if contact number matches
            }
        }
        return null; // Return null if contact number is not found
    }
}