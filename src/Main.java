import collections.CollectionsRunner;
import oop.OopRunner;
import strings.StringsRunner;

void main() {
    System.out.println("OOP");
    System.out.println("-----------------------------------");
    OopRunner.run();
    System.out.println("-----------------------------------");
    System.out.println();

    System.out.println("Strings");
    System.out.println("-----------------------------------");
    StringsRunner.run();
    System.out.println("-----------------------------------");
    System.out.println();

    System.out.println("Collections");
    System.out.println("-----------------------------------");
    CollectionsRunner.run();
    System.out.println("-----------------------------------");
}
