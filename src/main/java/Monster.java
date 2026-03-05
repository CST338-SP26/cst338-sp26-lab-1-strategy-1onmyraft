import java.util.ArrayList;
import java.util.HashMap;

public class Monster {
    private final Integer hp;
    private final Integer xp;
    private final Integer maxHP;
    private HashMap<String, Integer> items;


    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
        this.hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    @Override
    public String toString(){
        return "hp=" + hp + "/" + maxHP;
    }
}
