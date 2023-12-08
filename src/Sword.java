public class Sword implements AttackEquipment{

    private int level;
    private int atk;

    /** Constructor of Sword class initialization to default status.
     *
     * @param atk : assign attack value of Sword.
     * @param level : assign level of this Sword.
     *
     */
    Sword(int atk, int level){
        this.atk = atk;
        this.level = level;
    }

    /** Constructor Overload  of Sword class initialization.
     *
     * @param atk : assign attack value of Sword.
     * effects : set level of sword to 1
     *
     */
    Sword(int atk){
        this(atk, 1);
    }

    /** Level up to this sword and print status level up.
     *
     * @param c : Character who equip this sword.
     * effects : This sword's level increase.
     *
     */
    public void levelUp(Character c){
        level++;
        System.out.println("Sword Level Up ++ [Lvl. " + level + "]!!");
        setRunSpeed(c);
    }

    /** Change run speed character who equip this sword.
     *
     * @param c : Character who equip this sword.
     * effects : Run speed of character who equip this sword has been changed.
     *
     */
    public void setRunSpeed(Character c) {
        c.runSpeed = c.max_runSpeed - (30+10*(level*0.1));
    }

    /** Get sword's attack value.
     *
     * @returns : This sword's attack value.
     *
     */
    public double attackValue(){
        return atk*(1+0.1*level);
    }
    
}
