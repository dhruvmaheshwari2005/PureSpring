package org.example;


public class Example {
    Doggy animal;

    public void setAnimal(Doggy doggy) {
        this.animal = doggy;
    }

//    public Example(Animal animal)  {
//        this.animal = animal;
//    }

//    public void setE2(Example2 e2) {
//        this.e2 = e2;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }

    public void doSomething() {
        System.out.println("Do something");
        animal.bite();
    }
}
