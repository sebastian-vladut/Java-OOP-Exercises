package Exercise_08_SimpleGameCharacterSystem;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 80, 30, 5);
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
