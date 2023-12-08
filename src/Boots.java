public class Boots implements DefenseEquipment{
    
    private int level;
    private int def;
    private final int passiveSpeed;

    /** Constructor of Boots class initialization.
     *
     *  @param def   defense value of boot object.
     *  @param level level of boot object.
     */
    Boots(int def, int level){
        this.def = def;
        this.level = level;
        this.passiveSpeed = 20;
    }

    /** Overload constructor of Boots class.
     *  effects: will assign level 1 to object if not pass level parameter.
     *
     *  @param def defense value of boot object.
     */
    Boots(int def){
        this(def, 1);
    }

    /** Uplevel the boot object.
     *  effects: run speed value of input character will change when boots level up.
     *
     *  @param c character object.
     */
    public void levelUp(Character c){
        level++;
        System.out.println("Armor Level Up ++ [Lvl. " + level + "]!!");
        setRunSpeed(c);
    }

    /** Calculate and set run speed value to character from boot object value.
     *
     *  @param c character object.
     */
    public void setRunSpeed(Character c) {
        c.runSpeed = c.max_runSpeed - (40+10*(level*0.1)) + passiveSpeed;
    }

    /** Calculate defense value of Boots object
     *
     *  @return defense value calculate from boots defense and boots level.
     */
    public double defenseValue(){
        return def*(1+0.02*level);
    }
}