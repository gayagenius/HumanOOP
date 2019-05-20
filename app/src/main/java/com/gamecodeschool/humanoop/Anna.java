package com.gamecodeschool.humanoop;

public class Anna extends Human {
    public int height;
    public Anna(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    @Override
    public void eat() {
        super.eat();
        weight = weight + 2;
    }

}

