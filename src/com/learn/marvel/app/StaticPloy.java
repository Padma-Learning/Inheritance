package com.learn.marvel.app;

import com.learn.marvel.heros.IronMan;

public class StaticPloy {
    public static void main(String[] args) {
        IronMan ironMan=new IronMan();
        ironMan.eat("Pasta");
        ironMan.eat("Pasta",1);
    }
}
