package org.example;

public class Doggy implements Animal{
    @Override
    public void bite() {
        System.out.println("I don't bite");
    }

    @Override
    public void makeSound() {
        System.out.println("bhou bhou");
    }
}
