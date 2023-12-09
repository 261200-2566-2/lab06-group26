public interface CharacterI {
    double characterDefense();
    void receiveDamage(double damage);
    void levelUp();
    void setArmor();
    void clearArmor();
    void armorLevelUp();
    void setBoots();
    void clearBoots();
    void bootsLevelUp();
}

interface SwordsmanI extends CharacterI{
    void attack(Character c);
    void setSword();
    void clearSword();
    void swordLevelUp();
    void status();
}

interface ArcherI extends CharacterI{
    void attack(Character c);
    void setBow();
    void clearBow();
    void bowLevelUp();
    void status();
}