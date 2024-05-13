package ball;

class basketball extends ball{
    private String game;

    private basketball(String g, String radi){
        super(radi);
        game = g;
    }

    public String getname(){
        return game;
    }

    public basketball getBasektObj(String game, String radius){
        return new basketball(game, radius);
    }    
}
