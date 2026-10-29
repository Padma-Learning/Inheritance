package com.learn.marvel.app;

import com.learn.marvel.base.Person;
import com.learn.marvel.heros.IronMan;

public class MarvelMain {

    public static void main(String[] args) {

        IronMan ironMan=new IronMan();
        ironMan.walk();
        ironMan.eat("pasta");
        ironMan.sleep();
        ironMan.usePower();

        Person person=new Person();
        int hc=person.hashCode();
        String str=person.toString();
    }
}
