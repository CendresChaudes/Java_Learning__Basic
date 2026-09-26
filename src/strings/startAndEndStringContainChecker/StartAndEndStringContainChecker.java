package strings.startAndEndStringContainChecker;

public class StartAndEndStringContainChecker {

    public static boolean check(String stroke, String word) {
        boolean isStartWithStroke = word.startsWith(stroke);
        boolean isEndWithStroke = word.endsWith(stroke);

        return isStartWithStroke && isEndWithStroke;
    }
}
