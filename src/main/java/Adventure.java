public class Adventure {
    private Map map;
    private Player player;

    public Room getCurrent(){
        return map.getCurrent();

    }
    public String getRoom(){
        return map.getCurrent().getName() + map.getCurrent().getDescription();
    }

    }

