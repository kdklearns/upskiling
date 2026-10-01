package org.kdklearns.oop;

public interface A {

    static void test1() {
        System.out.println("A's static method");
    }

    default void test2() {
        System.out.println("A's default method");
    }

    void foo1();
    void foo2();
}
