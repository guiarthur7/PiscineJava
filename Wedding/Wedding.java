import java.util.*;

public class Wedding {

    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        Map<String, String> couples = new HashMap<>();
        List<String> f1 = new ArrayList<>(first);
        List<String> f2 = new ArrayList<>(second);
        Collections.shuffle(f1);
        Collections.shuffle(f2);

        int size = Math.min(f1.size(), f2.size());

        for (int i = 0; i < size; i++) {
            couples.put(f1.get(i), f2.get(i));
        }
        return couples;
    }
}