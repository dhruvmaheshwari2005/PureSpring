package org.example;

public class Cata implements Animal{
    @Override
    public void bite() {
        System.out.println("khau khau");
    }

    @Override
    public void makeSound() {
        System.out.println("myau myau");
    }
}
