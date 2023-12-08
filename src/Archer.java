public class Archer extends Character implements ArcherI {
    
    protected Bow bow;
    protected boolean bow_equip;

    /** Constructor of Archer class initialization.
     *
     * @param name  name of this Archer character.
     * @param level assign level of this character.
     */
    Archer(String name, int level){
        super(name, level);
        status();
    }

    /** Attack some people in RPG Game.
     *  effects: "total atk : 0" printed if damage from this character
     *          is less than or equal to the defense value of the attacked person.
     *          this character will not be able to attack.
     *  @param c character who needs to attack.
     */
    public void attack(Character c){
        double val = damage + (bow_equip ? bow.attackValue() : 0);
        c.receiveDamage(val);
        System.out.println("---------------------------------------------------");
        System.out.println(this.name + " attack " + c.name);
        System.out.println(this.name + " +atk : " + val);
        System.out.println(c.name + " -def : " + c.characterDefense());
        if (val <= c.characterDefense())
            System.out.println("total atk : 0");
        else
            System.out.println("total atk : " + (val - c.characterDefense()));
        System.out.println(c.name + "HP : "+ c.hp);
        System.out.println("---------------------------------------------------");
    }

    /** Equip the bow for Archer.
     *     create new bow object and set true equip status of bow for this archer.
     *     and print status message and bow attack value.
     *
     *  effects: after equip the bow, character attack value will increase.
     */
    public void setBow(){
        bow = new Bow(65);
        bow_equip = true;
        bow.setRunSpeed(this);
        System.out.println("---------------------------------------------------");
        System.out.println("Hero : " + this.name);
        System.out.println("Equip a Bow ....");
        System.out.println("Bow Damage : " + bow.attackValue());
        System.out.println("---------------------------------------------------");
    }

    /** Unload this archer's bow.
     *     set false equip status of bow for this archer and print status message.
     *
     *  effects: The old bow object will remain in the bow variable until user
     *           call setBow() method to equip the new bow.
     *  effects: after unload the bow, character attack value will decrease.
     */
    public void clearBow(){
        bow_equip = false;
        System.out.println("---------------------------------------------------");
        System.out.println("Hero : " + this.name);
        System.out.println("Now Not Have Bow");
        System.out.println("---------------------------------------------------");
    }

    /** Uplevel the bow for Archer
     *      call method levelUp() in bow object to uplevel the bow
     *      and print status message.
     */
    public void bowLevelUp(){
        bow.levelUp(this);
        System.out.println("---------------------------------------------------");
        System.out.println("Hero : " + this.name);
        System.out.println("Bow LevelUp .....");
        System.out.println("Bow Damage : " + bow.attackValue());
        System.out.println("---------------------------------------------------");
    }

    /** Print every status for user to know about Archer character.
     */
    public void status(){
        System.out.println("---------------------------------------------------");
        System.out.println("Status :");
        System.out.println("Name : " + this.name);
        System.out.println("Career : Archer" );
        System.out.println("Level : " + this.level);
        System.out.println("HP : " + this.hp);
        System.out.println("Mana : "+ this.mana);
        System.out.println("Damage : " + (this.damage + (this.bow_equip ? this.bow.attackValue() : 0)));
        System.out.println("RunSpeed : "+this.runSpeed);
        if(this.bow_equip)
            System.out.println("Bow : Have Bow") ;
        else
            System.out.println("Bow : Not Have Bow");
        if(this.armor_equip)
            System.out.println("Armor : Have Armor") ;
        else
            System.out.println("Armor : Not Have Armor");
        System.out.println("---------------------------------------------------");
    }
}
