package collections.toOddListTransformer;

import java.util.ArrayList;
import java.util.List;

public class ToOddListTransformer {
    public static List<Integer> transform(List<Integer> list) {
        List<Integer> oddList = new ArrayList<>();

        for (Integer integer : list) {
            if (integer % 2 != 0) {
                oddList.add(integer);
            }
        }

        return oddList;
    }
}
