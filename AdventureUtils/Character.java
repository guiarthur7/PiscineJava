import java.util.List;
import java.util.ArrayList;

public class Character {

    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
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
        if (target != null) {
            target.takeDamage(9);
        }
    }

    public static String printStatus() {
        String separator = "------------------------------------------ ";
        StringBuilder s = new StringBuilder();
        s.append(separator).append("\n");

        if (allCharacters.isEmpty()) {
            s.append("Nobody's fighting right now ! \n");
        } else {
            s.append("Characters currently fighting : \n");
            for (Character c : allCharacters) {
                s.append(" - ").append(c.toString()).append("\n");
            }
        }

        s.append(separator);
        return s.toString();
    }

    public static Character fight(Character c1, Character c2) {
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
        return c1.currentHealth > 0 ? c1 : c2;
    }
}