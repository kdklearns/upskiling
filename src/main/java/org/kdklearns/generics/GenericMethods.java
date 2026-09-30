package org.kdklearns.generics;

import java.util.List;

public class GenericMethods {

    public static <T extends Animal> void genericMethod(T object) {
        System.out.println(object);
        object.eat();
        object.walk();
    }

    public static <K, V> void shout(K thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!");
        System.out.println(otherThingToShout + "!!!");
    }

    public static <T> void print(List<T> myList) {
        System.out.println(myList);
    }

    public static void wildPrint(List<?> myList) {
        System.out.println(myList);
    }

}
