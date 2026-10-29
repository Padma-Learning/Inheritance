package com.learn.marvel.app;

import com.learn.marvel.Animals.Cat;
import com.learn.marvel.Animals.Dog;
import com.learn.marvel.base.Animal;

public class AnimalUtility {

    public static void printName(Animal animal){
        System.out.println(animal.getName());
        animal.eat();
    }
    public static void performAction(Animal animal){
            animal.eat();
            if(animal instanceof Dog){
                Dog dog=(Dog) animal;
                dog.bark();
            } else if (animal instanceof Cat cat)//java 16 introduce this new feature
            {
                //Cat cat=(Cat) animal;
                cat.meow();


            }
    }
}
