import java.util.*;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        if (list == null) {
            return null;
        }
        List<Integer> res = new ArrayList<>(list);
        res.sort(Comparator.naturalOrder());
        return res;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list == null) {
            return null;
        }
        List<Integer> res = new ArrayList<>(list);
        res.sort(Comparator.reverseOrder());
        return res;
    }
}