public class Character {

    public int maxHealth;
    public int currentHealth;
    private final String name;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public String getName() {
        return this.name;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    @Override
    public String toString() {
        if (this.currentHealth > 0) {
            return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
        } else {
            return String.format("%s : KO", this.name);
        }
    }

    public void takeDamage(int damages) {
        if (damages >= this.currentHealth) {
            this.currentHealth = 0;
        } else {
            this.currentHealth -= damages;
        }
    }

    public void attack(Character target) {
        target.takeDamage(9);
    }
}