public class Weapon {
    private final String name;
    public int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getWeaponName() {
        return this.name;
    }

    public int getWeaponDamage() {
        return this.damage;
    }

    @Override
    public String toString() {
        return String.format("%s deals %d damages", this.getWeaponName(), this.getWeaponDamage());
    }
}