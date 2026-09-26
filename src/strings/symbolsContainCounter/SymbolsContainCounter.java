package strings.symbolsContainCounter;

public class SymbolsContainCounter {
    private static final String SYMBOLS = ".,!";

    public static int toCountFor(String stroke) {
        int count = 0;

        for (char character : stroke.toCharArray()) {
            if (SYMBOLS.indexOf(character) != -1) {
                count++;
            }
        }

        return count;
    }
}
