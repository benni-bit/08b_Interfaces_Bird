package com.cc.java;

public class Bird implements Flyable,IFeathers{





    @override
    public String fly(){
        return "I can fly at 20mph!";
    }

    @override 
    public String hasFeathers(){
        return "I'm a bird, I have feathers!";
    }
}