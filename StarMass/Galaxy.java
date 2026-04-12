import java.util.*;

public class Galaxy {

    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        this.celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return this.celestialObjects;
    }

    public void addCelestialObject(CelestialObject c) {
        this.celestialObjects.add(c);
    }

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> repartition = new HashMap<>();

        repartition.put("Star", 0);
        repartition.put("Planet", 0);
        repartition.put("Other", 0);

        for (CelestialObject obj : this.celestialObjects) {
            int ancienStar = repartition.get("Star");
            int ancienPlanet = repartition.get("Planet");
            int ancienOther = repartition.get("Other");
            if (obj instanceof Star) {
                repartition.put("Star", ancienStar + obj.getMass());
            }
            else if (obj instanceof Planet) {
                repartition.put("Planet", ancienPlanet + obj.getMass());
            }
            else {
                repartition.put("Other", ancienOther + obj.getMass());
            }
        }
        return repartition;
    }
}