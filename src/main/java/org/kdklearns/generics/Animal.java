package org.kdklearns.generics;

public class Animal {

    boolean isAlive;

    public Animal() {
        isAlive = true;
    }

    public void eat() {
        System.out.println("I can eat");
    }

    public void walk() {
        System.out.println("I can walk");
    }

    public void kill() {
        isAlive = false;
    }

    @Override
    public String toString() {
        return "I am a Dog!";
    }
}
