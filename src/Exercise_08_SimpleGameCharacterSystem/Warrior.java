package Exercise_08_SimpleGameCharacterSystem;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 100, 20, 10);
    }

    @Override
    public void attack(Character target) {
        System.out.println(this.getName() + " attacks " + target.getName());

        int damage = this.getAttackPower() - target.getDefense();
        if (damage < 0) {
            damage = 0;
        }

        target.takeDamage(damage);
    }
}
