public class CelestialObject {
    public double x, y, z;
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
}