import java.util.*;

class portal {
    static Scanner sc = new Scanner(System.in);
    
    private String name;
    private long regno;
    private long Contact_no;
    private String Loc;
    private String mail_Id;

    public portal(){}

    portal(String s_name, long s_regno, long s_Contact_no, String s_Loc, String s_mail_Id){
        this.name = s_name;
        this.regno = s_regno;
        this.Contact_no = s_Contact_no;
        this.Loc = s_Loc;
        this.mail_Id = s_mail_Id;
    }

    //getter methods
    public String get_name(){
        return name;
    }

    public long get_regno(){
        return regno;
    }

    public long get_Contactno(){
        return Contact_no;
    }

    public String get_Loc(){
        return Loc;
    }

    public String get_feesUpdate(){
        return mail_Id;
    }

    //Setter methods
    public void set_Contactno(long newContactNo){
        if(verification()){
            Contact_no = newContactNo;
        }
        else{
            System.out.println("VErification failed can't modify your contact Number...");
        }
    }

    public void set_Loc(String newLoc){
        if(verification()){
            Loc = newLoc;
        }
        else{
            System.out.println("VErification failed can't modify your Locaion...");
        }
    }

    public void set_mail_id(String newmail_id){
        if(verification()){
            mail_Id = newmail_id;
        }
        else{
            System.out.println("Verification failed can't modify your mail_id...");
        }
    }

    //verification method
    public boolean verification(){
        boolean check =  true;
        System.out.print("Enter the registered contact_no: ");
        long user_reg_no = sc.nextLong();

        if(user_reg_no != Contact_no){
            check = false;
        }

        System.out.print("OTP: ");
        int gen_OTP = (int)(Math.random()*99999+99999);
        System.out.println(gen_OTP);
        System.out.print("Enter the OTP: ");
        int user_entered_OTP = sc.nextInt();

        if(gen_OTP != user_entered_OTP){
            check = false;
        }
        return check;
    }

    //object accepting method
    public static portal getstudentobj(String n, long Reg, long Co, String L, String m_id){
        return new portal(n, Reg, Co, L, m_id);
    }

    public long details() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'details'");
    }
}