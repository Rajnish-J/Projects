import java.util.*;
class aadhar{
    static Scanner sc = new Scanner(System.in);

    //states
    private String name, address;
    private Long contact, aadhar_no;

    //constructor
    private aadhar (){

    }

    private aadhar(String name, long contact, String address, long aadhar_no){
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.aadhar_no = aadhar_no;
    }

    //getter methods
    public String getname(){
        return name;
    }

    public long getContact(){
        return contact;
    }

    public String getAddress(){
        return address;
    }

    public long getaadhar_no(){
        return aadhar_no;
    }

    //setter methods
    public void setName(String newName){
        if(DoVerification()){
            name = newName;
            System.out.println("Modification Successful");
        }
        else{
            System.out.println("Verification failed cannot modify name");
        }
    }

    public void setContact(long newcontact){
        if(DoVerification()){
            contact = newcontact;
            System.out.println("Modification Successful");
        }
        else{
            System.out.println("Verification failed cannot modify name");
        }
    }

    public void setaddress(String newaddress){
        if(DoVerification()){
            address = newaddress;
            System.out.println("Modification Successful");
        }
        else{
            System.out.println("Verification failed cannot modify name");
        }
    }
    
    // verification methods
    public boolean DoVerification(){
        boolean res = true;
        System.out.print("Enter the registered contact - no: ");
        long uecn = sc.nextLong();

        if(uecn != contact){
            System.out.println("Sorry U entered wrong number... :(");
            res = false;
        }
        
        System.out.println("Enter the OTP: ");
        int sys_otp = (int)(Math.random()*99999+9999);
        System.out.println(sys_otp);
        System.out.println("Enter the genrated OTP: ");
        int ueotp = sc.nextInt();

        if(ueotp != sys_otp){
            System.out.println("Sorry U entered OTP number... :(");
            res = false;
        }

        return res;
    }

    // object method
    public static aadhar getaadharObj(String n, long con, String addr, long aadh_no){
        return new aadhar(n, con, addr, aadh_no);
    }
}