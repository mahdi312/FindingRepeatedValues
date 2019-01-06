import java.util.*;

public class RepeatedValues<T extends Comparable> {

    public Set<T> findRepeatedValues(List<T> list){
        Set<T> set = new HashSet<>();
        Set<T> repeatedValues = new HashSet<>();
        for (T i : list) {
            if (!set.add(i)) {
                repeatedValues.add(i);
            }
        }
        return repeatedValues;
    }
}
