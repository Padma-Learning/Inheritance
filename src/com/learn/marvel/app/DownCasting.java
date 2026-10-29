package com.learn.marvel.app;

import com.learn.marvel.Animals.Cat;
import com.learn.marvel.Animals.Dog;
import com.learn.marvel.base.Animal;

public class DownCasting {

    public static void main(String[] args) {
        Animal anm;
        Dog dog = new Dog();
        anm = dog;//upcasting

        dog = (Dog) anm;
        //Cat cat=new Cat();
        //cat=(Cat)anm;//downcasting

        AnimalUtility.performAction(dog);
        //AnimalUtility.performAction(cat);
        if (anm instanceof Cat) {
            Cat cat = (Cat) anm;
        }
    }


    }

