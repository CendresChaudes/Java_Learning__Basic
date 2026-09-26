package collections.toUniqueListTransformer;


import java.util.List;

public class ToUniqueListTransformerRunner {

    public static void run() {
        List<Integer> initialList = List.of(0, 1, 2, 2, 3, 3, 4, 5, 5, 5, 5);

        System.out.println("Initial list: " + initialList);
        System.out.println("Result list:  " + ToUniqueListTransformer.transform(initialList));
    }
}
