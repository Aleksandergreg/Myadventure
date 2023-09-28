public class Adventure {
    Map map = new Map();
    private Player player;



    public Player getPlayer(){
        return player;
    }

    public Room getCurrent(){
        return map.getCurrent();

    }
    public String getRoom(){
        return map.getCurrent().getName() + map.getCurrent().getDescription();
    }
public boolean goWest(){
        return player.goWest();
}
    }

