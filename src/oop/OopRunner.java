package oop;

import oop.advanced.GameRunner;
import oop.basic.TimeIntervalRunner;

public class OopRunner {

    public static void run() {
        System.out.println("1.");
        TimeIntervalRunner.run();
        System.out.println();

        System.out.println("2.");
        GameRunner.run();
    }
}
