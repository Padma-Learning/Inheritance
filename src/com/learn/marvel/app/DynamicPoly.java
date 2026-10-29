package com.learn.marvel.app;

import com.learn.marvel.base.Person;
import com.learn.marvel.heros.IronMan;

public class DynamicPoly {

    public static void main(String[] args) {
        Person person=new IronMan();//upcasting
        person.walk();
        person.eat("Ice Cream");

        IronMan ironMan=new IronMan();
        ironMan.callOverriddenEatMethod();

    }
}
