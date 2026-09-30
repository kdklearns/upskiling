package org.kdklearns.generics;

public class Cat extends Animal {

    public void purr() {
        System.out.println("Meoow!");
    }

    @Override
    public String toString() {
        return "I am a Cat!";
    }
}
