package ball;

class tennisball extends ball{
    private String game;

    private tennisball(String g, String radi){
        super(radi);
        game = g;
    }

    public String getname(){
        return game;
    }

    public tennisball getTennisObj(String game, String radius){
        return new tennisball(game, radius);
    }
}