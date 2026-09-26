package strings;

import strings.smileTransformer.SmileTransformerRunner;
import strings.startAndEndStringContainChecker.StartAndEndStringContainCheckerRunner;
import strings.symbolsContainCounter.SymbolsContainCounterRunner;

public class StringsRunner {

    public static void run() {
        System.out.println("1.");
        SmileTransformerRunner.run();
        System.out.println();

        System.out.println("2.");
        StartAndEndStringContainCheckerRunner.run();
        System.out.println();

        System.out.println("3.");
        SymbolsContainCounterRunner.run();
    }
}
