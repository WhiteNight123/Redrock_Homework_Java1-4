package three.lv1;

public class Hero implements FightInterface {
    private int hp = 100;

    @Override
    public void fight(FightInterface fightInterface) {
        if (hp > 0) {
            hp -= 5;
            System.out.println("hero受到5点伤害");
            if (hp > 0) {

                attack(fightInterface);
            } else {
                System.out.println("hero\tdie...");
            }
        }
    }

    public void attack(FightInterface fightInterface) {
        System.out.println("hero\thp=" + hp);
        fightInterface.fight(this);
    }
}
