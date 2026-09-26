package collections;

import collections.toOddListTransformer.ToOddListTransformerRunner;
import collections.toUniqueListTransformer.ToUniqueListTransformerRunner;

public class CollectionsRunner {

    public static void run() {
        System.out.println("1.");
        ToOddListTransformerRunner.run();
        System.out.println();

        System.out.println("2.");
        ToUniqueListTransformerRunner.run();
        System.out.println();
    }
}
