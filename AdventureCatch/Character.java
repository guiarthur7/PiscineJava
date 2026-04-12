import java.util.List;
import java.util.ArrayList;

public abstract class Character {

    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();

    private Weapon weapon;

    public Character(String name, int maxHealth, Weapon weapon) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.weapon = weapon;
        allCharacters.add(this);
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public String getName() {
        return this.name;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    protected void setCurrentHealth(int newValue) {
        this.currentHealth = newValue;
    }

    @Override
    public String toString() {
        if (this.currentHealth > 0) {
            return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
        } else {
            return String.format("%s : KO", this.name);
        }
    }

    public abstract void takeDamage(int damages) throws DeadCharacterException;;

    public abstract void attack(Character character) throws DeadCharacterException;

    public static String printStatus() {
        StringBuilder status = new StringBuilder();
        status.append("------------------------------------------\n");
        if (allCharacters.isEmpty()) {
            status.append("Nobody's fighting right now !\n");
        } else {
            status.append("Characters currently fighting :\n");
            for (Character character : allCharacters) {
                status.append(String.format(" - %s\n", character.toString()));
            }
        }
        status.append("------------------------------------------\n");
        return status.toString();
    }

    public static Character fight(Character c1, Character c2) {
        try {
            while (c1.currentHealth > 0 && c2.currentHealth > 0) {
                c1.attack(c2);
                if (c2.currentHealth <= 0) {
                    return c1;
                }
                c2.attack(c1);
                if (c1.currentHealth <= 0) {
                    return c2;
                }
            }
        } catch (DeadCharacterException e) {
            System.out.println(e.getMessage());
        }
        return c1.currentHealth > 0 ? c1 : c2;
    }
}