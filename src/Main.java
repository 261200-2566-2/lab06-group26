
public class Main {
    public static void main(String[] args) {
        Swordman a = new Swordman("PremX",100);
        Archer b = new Archer("RobinHood",100);
        a.setSword();
        b.setBow();
        b.setArmor();
        a.attack(b);
        for (int i = 0;i<20;i++){
            a.swordLevelUp();
            b.bowLevelUp();
        }
        a.attack(b);
        b.attack(a);
    }
}