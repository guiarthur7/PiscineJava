public class Templar extends Character implements Tank, Healer {

    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getShield() {
        return this.shield;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character target) {
        int newHealth = target.getCurrentHealth() + this.getHealCapacity();
        if (newHealth >= target.getMaxHealth()) {
            target.setCurrentHealth(target.getMaxHealth());
        } else {
            target.setCurrentHealth(newHealth);
        }
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() == 0) {
            return this.getName() + " has been beaten, even with its " + this.getShield() + " shield. So bad, it could heal " + this.getHealCapacity() + " HP.";
        } else {
            return this.getName() + " is a strong Templar with " + this.getCurrentHealth() + " HP. It can heal " + this.getHealCapacity() + " HP and has a shield of " + this.getShield() + ".";
        }
    }

    @Override
    public void attack(Character character) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        this.heal(this);
        int damage = (this.getWeapon() != null)
                ? this.getWeapon().getDamage()
                : 6;

        character.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damages) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        if (damages >= this.getCurrentHealth()) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - (damages - this.shield));
        }
    }
}