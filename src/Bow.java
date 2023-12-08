public class Bow implements BowI{
    
    private int level;
    private int atk;
    private int arrow;

    /** Constructor of Bow class initialization to default status.
     *
     * @param atk : assign attack value of Bow.
     * @param level : assign level of this Bow.
     *
     */
    Bow(int atk, int level){
        this.atk = atk;
        this.level = level;
        this.arrow = 50;
    }

    /** Constructor Overload  of Bow class initialization.
     *
     * @param atk : assign attack value of Bow.
     * effects : set level of bow to 1
     *
     */
    Bow(int atk){
        this(atk, 1);
    }

    /** Level up to this bow and print status level up.
     *
     * @param c : Character who equip this bow.
     * effects : This bow's level increase.
     *
     */
    public void levelUp(Character c){
        level++;
        System.out.println("Bow Level Up ++ [Lvl. " + level + "]!!");
        setRunSpeed(c);
    }

    /** Change run speed character who equip this bow.
     *
     * @param c : Character who equip this bow.
     * effects : Run speed of character who equip this bow has been changed.
     *
     */
    public void setRunSpeed(Character c) {
        c.runSpeed = c.max_runSpeed - (25+10*(level*0.1));
    }

    /** Reload the number of arrows of this bow.
     *
     * effects : number of arrows of this bow has been changed.
     *
     */
    public void reloadArrows(){
        arrow += 5;
        System.out.println("Arrow reloaded !! [ +5 arrows ]");
    }

    /** Get bow's attack value.
     *
     * effects : "Out of arrows. Please reload arrows."
     *           printed if number of arrows less than or equal zero.
     * @returns : This bow's attack value.
     *
     */
    public double attackValue(){
        if(arrow <= 0) {
            System.out.println("Out of arrows. Please reload arrows.");
            return 0;
        }
        return atk*(1+0.09*level);
    }
}
