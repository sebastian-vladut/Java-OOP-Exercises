package Exercise_08_SimpleGameCharacterSystem;

/**
 * An abstract base class for a game character.
 * It defines the core attributes and actions for all characters, as health, attack and defense.
 */
public abstract class Character {

    private String name;
    private int health;
    private int attackPower;
    private int defense;
    private boolean isDefending = false; // Track if the defend action is active

    /**
     * Constructs a new character.
     * @param name The name of the character.
     * @param health The health of the character.
     * @param attackPower The attack power of the character.
     * @param defense The defense of the character.
     */
    public Character(String name, int health, int attackPower, int defense) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    /**
     * An abstract method for the character's attack.
     * @param target The character being attacked.
     */
    public abstract void attack(Character target);

    /**
     * Activate the character's defense, depending on the user input.
     */
    public void defend() {
        this.isDefending = true;
        System.out.println(this.name + " is defending.");
    }

    /**
     * Reset the character defense state at the start of every turn.
     */
    public void resetState() {
        this.isDefending = false;
    }

    /**
     * Calculates the damage taken by the character.
     * @param damage The damage dealt by the attacker.
     */
    public void takeDamage(int damage) {
        if (this.isDefending) {
            damage /= 2;
        }

        this.health -= damage;

        if (this.health < 0) {
            this.health = 0;
        }

        System.out.println(this.name + " takes " + damage + " damage. " + this.health + " health remaining.");
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefense() {
        return defense;
    }
}
