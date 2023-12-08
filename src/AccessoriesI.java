public interface AccessoriesI {
    void levelUp(Character c);
    void setRunSpeed(Character c);
}

interface AttackEquipment extends AccessoriesI {
    double attackValue();
}

interface BowI extends AttackEquipment {
    void reloadArrows();
}

interface DefenseEquipment extends AccessoriesI {
    double defenseValue();
}