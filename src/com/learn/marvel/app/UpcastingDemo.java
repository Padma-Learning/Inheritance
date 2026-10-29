package com.learn.marvel.app;

import com.learn.marvel.Animals.Cat;
import com.learn.marvel.Animals.Dog;
import com.learn.marvel.base.Animal;

public class UpcastingDemo {

    public static void main(String[] args) {
        Animal anm=new Animal();
        anm.setName("Scooby");
        //System.out.println(anm.getName());
        AnimalUtility.printName(anm);
        //anm.eat();

        anm=new Dog();
        anm.setName("Charlie");
        //System.out.println(anm.getName());
        AnimalUtility.printName(anm);
        //anm.eat();

        Cat cat=new Cat();
        cat.setName("Snoopy");
        AnimalUtility.printName(cat);
        //cat.eat();
    }
}
