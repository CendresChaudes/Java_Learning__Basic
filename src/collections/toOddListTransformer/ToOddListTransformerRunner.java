package collections.toOddListTransformer;


import java.util.List;

public class ToOddListTransformerRunner {

    public static void run() {
        List<Integer> initialList = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        System.out.println("Initial list: " + initialList);
        System.out.println("Result list:  " + ToOddListTransformer.transform(initialList));
    }
}
