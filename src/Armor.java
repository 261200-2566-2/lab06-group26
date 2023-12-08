public class Armor implements DefenseEquipment{
    
    private int level;
    private int def;

    /** Constructor of Armor class initialization.
     *
     * @param def   defense value of armor object.
     * @param level level of armor object.
     */
    Armor(int def, int level){
        this.def = def;
        this.level = level;
    }

    /** Overload constructor of Armor class.
     *  effects: will assign level 1 to object if not pass level parameter.
     *
     *  @param def defense value of armor object.
     */
    Armor(int def){
        this(def, 1);
    }

    /** Uplevel the Armor object.
     *  effects: run speed value of input character will change when armor level up.
     *
     *  @param c character object.
     */
    public void levelUp(Character c){
        level++;
        System.out.println("Armor Level Up ++ [Lvl. " + level + "]!!");
        setRunSpeed(c);
    }
    
    /** Calculate and set run speed value to character from Armor object value.
     *
     *  @param c character object.
     */
    public void setRunSpeed(Character c) {
        c.runSpeed = c.max_runSpeed - (40+10*(level*0.1));
    }

    /** Calculate defense value of Armor object
     *
     *  @return defense value calculate from armor defense and armor level.
     */
    public double defenseValue(){
        return def*(1+0.05*level);
    }
}
