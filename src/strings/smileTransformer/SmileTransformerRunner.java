package strings.smileTransformer;

public class SmileTransformerRunner {

    public static void run() {
        String initialString = "nkldklw :( nlddqkdkwn :)  lndwdlwd :( j wdqj  w :3";

        System.out.println("Before: " + initialString);
        System.out.println("After:  " + SmileTransformer.transform(initialString));
    }
}
