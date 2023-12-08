/** Archer class not completed */

public class Archer extends Character implements ArcherI {
    
    protected Bow bow;
    protected boolean bow_equip;

    Archer(String name, int level){
        super(name, level);
        status();
    }

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
    };

    public void setBow(){
        bow = new Bow(65);
        bow_equip = true;
        bow.setRunSpeed(this);
        System.out.println("---------------------------------------------------");
        System.out.println("Hero : " + this.name);
        System.out.println("Equip a Bow ....");
        System.out.println("Bow Damage : " + bow.attackValue());
        System.out.println("---------------------------------------------------");
    };

    public void clearBow(){
        bow_equip = false;
        System.out.println("---------------------------------------------------");
        System.out.println("Hero : " + this.name);
        System.out.println("Now Not Have Bow");
        System.out.println("---------------------------------------------------");
    };

    public void bowLevelUp(){
        bow.levelUp(this);
        System.out.println("---------------------------------------------------");
        System.out.println("Hero : " + this.name);
        System.out.println("Bow LevelUp .....");
        System.out.println("Bow Damage : " + bow.attackValue());
        System.out.println("---------------------------------------------------");
    };

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
    };
}
