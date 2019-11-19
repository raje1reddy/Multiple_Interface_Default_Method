package com.padmaja.flowcontrol;

import org.junit.Test;

public class AnimalTest {
    Animal animal = new Animal();
    Jumpable jumpable = new Jumpable() {
        @Override
        public void relax() {
            System.out.println("No jumping");

        }
    };
    Moveable moveable = new Moveable() {
        @Override
        public void relax() {
            System.out.println("No moving");
        }
    };

    @Test
    public void reportProjectStatus() {
        animal.relax();
        jumpable.relax();
        moveable.relax();
    }
}