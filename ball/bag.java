package ball;

class bag {
    /*
    b <-- null bag is empty
    b <-- BB@344 Bag contains BB
    b <-- TB@233 Bag contains TB
    */
    
    private bag(){

    }

    public static bag getBagObj(){
        return new bag();
    }

    public void insertBall(ball b){
        if(this.b == null){
            this.b = b; // ball added into bag
            if(areyoubasketball()){
                basketball bb = (basketball)this.b;
                System.out.println(bb.getgame() + " :is added");
            }
            else{
                tennisball tt = (tennisball)this.b;
                System.out.println(tt.getgame() + " :is added");
            }
        }
        else{
            //Bag is already having ball
        }
    }

    public static boolean areyoubasketball(){
        return(b instanceof basketball);
    }

    public static boolean areyoutennnisball(){
        return(b instanceof tennisball);
    }

    public String whichsport(){
        String check;
        if(b instanceof basketball){
            check = "Basket Ball";
        }
        else if(b instanceof tennisball){
            check = "Tennis Ball";
        }
        else{
            check =  "null";
        }
        return check;
    }
}
