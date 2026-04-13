import java.util.List;

public class ListContains {
    public static boolean containsValue(List<Integer> list, Integer value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                return true;
            }
        }
        return false;
    }
}