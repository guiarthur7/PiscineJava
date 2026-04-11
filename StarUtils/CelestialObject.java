import java.util.Objects;

public class CelestialObject {
    public double x, y, z;
    public static final double KM_IN_ONE_AU = 150000000.0;
    public String name;
    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }
    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public String getName() {
        return name;
    }
    public void setX(double newValue) {
        x = newValue;
    }
    public void setY(double newValue) {
        y = newValue;
    }
    public void setZ(double newValue) {
        z = newValue;
    }
    public void setName(String newValue) {
        name = newValue;
    }

    public static double getDistanceBetween(CelestialObject c1, CelestialObject c2) {
        double dx = c1.x - c2.x;
        double dy = c1.y - c2.y;
        double dz = c1.z - c2.z;

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2) + Math.pow(dz, 2));
    }

    public static double getDistanceBetweenInKm(CelestialObject c1, CelestialObject c2) {
        return getDistanceBetween(c1, c2) * KM_IN_ONE_AU;
    }

    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", this.name, this.x, this.y, this.z);
    }
    public boolean equals(CelestialObject c) {
        if (this.x == c.x && this.y == c.y && this.z == c.z && this.name.equals(c.name)) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, x, y, z);
    }
}