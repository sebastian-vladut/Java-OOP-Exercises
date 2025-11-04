package Exercise_08_SimpleGameCharacterSystem;

public class Archer extends Character {

    public Archer(String name) {
        super(name, 100, 25, 5);
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
