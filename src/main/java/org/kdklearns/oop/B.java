package org.kdklearns.oop;

public interface B extends A {

    static void test1() {
        System.out.println("B's static method");
    }

    @Override
    default void test2() {
        System.out.println("B's default method");
    }

    void foo3();
}
