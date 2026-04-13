import java.util.List;
import java.util.ArrayList;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                index = i;
            }
        }
        if (index == 0) {
            return null;
        }
        return index;
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                return i;
            }
        }
        return null;
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}