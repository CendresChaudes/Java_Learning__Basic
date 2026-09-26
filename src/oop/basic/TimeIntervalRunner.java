package oop.basic;

public class TimeIntervalRunner {

    public static void run() {
        TimeInterval timeInterval1 = new TimeInterval(360);
        TimeInterval timeInterval2 = new TimeInterval(30,2,1);

        timeInterval1.print();
        timeInterval2.print();
    }
}
