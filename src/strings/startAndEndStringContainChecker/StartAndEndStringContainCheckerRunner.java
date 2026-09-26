package strings.startAndEndStringContainChecker;

import strings.smileTransformer.SmileTransformer;

public class StartAndEndStringContainCheckerRunner {

    public static void run() {
        System.out.println(StartAndEndStringContainChecker.check("kek", "keklolkek"));
        System.out.println(StartAndEndStringContainChecker.check("kek", "keklolke"));
        System.out.println(StartAndEndStringContainChecker.check("kek", "eklolkek"));
    }
}
