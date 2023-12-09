public class Character implements CharacterI{
    protected String name;
    protected int level;
    protected double hp;
    protected double max_hp;
    protected double mana;
    protected double max_mana;
    protected double runSpeed;
    protected double max_runSpeed;
    protected double damage;
    protected boolean armor_equip;
    protected boolean boots_equip;
    protected Armor armor;
    protected Boots boots;


    /** Constructor of Character class initialization to default status.
     *
     * @param name : name of this Character.
     * @param level : assign level of this Character.
     *
     */
    public Character(String name, int level){
        this.name = name;
        this.level = level;
        this.max_hp = this.hp = 100*10*level;
        this.max_mana = this.mana = 50+2*level;
        this.max_runSpeed = this.runSpeed = 100;
        this.damage = 15; // Punch damage initialization
        System.out.println("Create Hero Name : " + name);
    }


    /** Get character's defense value.
     *
     * @returns : The character's defense value by checking whether
     *            the character already has armor and shoes or not.
     *
     */
    public double characterDefense(){
        return (armor_equip ? armor.defenseValue() : 0) + (boots_equip ? boots.defenseValue() : 0);
    }


    /** Receive damage from other character who attack this character.
     *
     * @param damage : damage value from other character who attack this character.
     * effects : hp of this character has change if damage value from other character
     *           more than character's defense value.
     *
     */
    public void receiveDamage(double damage){
        if((characterDefense() - damage) >= 0)
            this.hp = hp + 0;
        else
            this.hp = hp + characterDefense() - damage;
    };

    /** Level up to this character and print status level up.
     *
     * effects : The character's level increase.
     * effects : The character's hp & mana has been change.
     *
     */
    public void levelUp(){
        this.level++;
        this.max_hp = this.hp = 100*10*level;
        this.max_mana = this.mana = 50+2*level;
        System.out.println(name + "Level Up +++ !!! [Lvl." + level + "]");
    };

    /** Character gain armor object and print status.
     *
     * effects : Character is increased his defense value.
     *
     */
    public void setArmor(){
        armor = new Armor(120);
        armor.setRunSpeed(this);
        armor_equip = true;
        System.out.println("---------------------------------------------------");
        System.out.println("Hero : " + this.name);
        System.out.println("Equip a Armor ....");
        System.out.println("Armor Defense : " + armor.defenseValue());
        System.out.println("---------------------------------------------------");
    };

    /** Character clear armor and print status.
     *
     * effects : Character is decreased his defense value.
     * effects : The old armor object will remain in the armor variable until
     *           user call setArmor() method to equip the new armor object.
     *
     */
    public void clearArmor(){
        armor_equip = false;
        System.out.println("---------------------------------------------------");
        System.out.println("Equip a Shield ....");
        System.out.println("Shield Defense : " + armor.defenseValue());
        System.out.println("---------------------------------------------------");
    };

    /** Level up character's armor and print status.
     *
     * effects : Character is increased his defense value.
     *
     */
    public void armorLevelUp(){
        armor.levelUp(this);
        System.out.println("---------------------------------------------------");
        System.out.println("Hero : " + this.name);
        System.out.println("Shield LevelUp .....");
        System.out.println("Shield Defense : " + armor.defenseValue());
        System.out.println("---------------------------------------------------");
    };

    /** Character gain boot object and print status.
     *
     * effects : Character is increased his defense value & run speed value.
     *
     */
    public void setBoots(){
        boots = new Boots(40);
        boots.setRunSpeed(this);
        boots_equip = true;
    };

    /** Character clear boot and print status.
     *
     * effects : Character is decreased his defense value & run speed value.
     * effects : The old boot object will remain in the boot variable until
     *           user call setBoots() method to equip the new boot object.
     *
     */
    public void clearBoots(){
        boots_equip = false;
    };

    /** Level up character's boot and print status.
     *
     * effects : Character is increased his defense value & run speed value.
     *
     */
    public void bootsLevelUp(){
        boots.levelUp(this);
    };
}