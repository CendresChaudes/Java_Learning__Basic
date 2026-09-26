package collections.toUniqueListTransformer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ToUniqueListTransformer {
    public static List<Integer> transform(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return set.stream().toList();
    }
}
