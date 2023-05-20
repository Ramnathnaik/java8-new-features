package com.concept.java8.functionaInterface;

// @FunctionalInterface
public interface FunctionalInterface {
    /* Abstract Method */
    void sayHello();

    /* Default Method */
    default void sayBye() {
        System.out.println("Bye!!");
    }
    
    /* Static Method */
    static void sayWelcome() {
        System.out.println("Welcome!");
    }
}
