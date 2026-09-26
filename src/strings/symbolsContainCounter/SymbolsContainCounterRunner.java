package strings.symbolsContainCounter;

import strings.smileTransformer.SmileTransformer;

public class SymbolsContainCounterRunner {

    public static void run() {
        String string = ".. dd  dq!dqdq,dq  d   !!!";

        System.out.println("String:       " + "'" + string + "'");
        System.out.println("Symbols count: " + SymbolsContainCounter.toCountFor(string));
    }
}
