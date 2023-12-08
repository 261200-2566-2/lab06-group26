public class Boots implements DefenseEquipment{
    
    private int level;
    private int def;
    private final int passiveSpeed;

    Boots(int def, int level){
        this.def = def;
        this.level = level;
        this.passiveSpeed = 20;
    }

    Boots(int def){
        this(def, 1);
    }

    public void levelUp(Character c){
        level++;
        System.out.println("Armor Level Up ++ [Lvl. " + level + "]!!");
        setRunSpeed(c);
    }

    public void setRunSpeed(Character c) {
        c.runSpeed = c.max_runSpeed - (40+10*(level*0.1)) + passiveSpeed;
    }

    public double defenseValue(){
        return def*(1+0.02*level);
    }
}