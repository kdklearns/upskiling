package org.kdklearns.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IntegerPrinter printer = new IntegerPrinter(23);
        printer.print();

        Printer<Integer> printer1 = new Printer<>(23);
        printer1.print();

        Printer<String> printer2 = new Printer<>("String");
        printer2.print();

        GenericMethods.genericMethod(new Dog());
        GenericMethods.genericMethod(new Cat());

        GenericMethods.shout("John", 23);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); numbers.add(2); numbers.add(3);

        GenericMethods.print(numbers);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog()); animals.add(new Cat());

        GenericMethods.print(animals);

        // Wildcards
        GenericMethods.wildPrint(numbers);
        GenericMethods.wildPrint(animals);
    }
}
