package com.company;

public class Car extends Vehicle
{
    public Car()
    {
        //System.out.println("konstruktor car");
    }

    @Override
    public void go()
    {
        //super.go();
        System.out.println("Go car");
    }

    void horn()
    {
        System.out.println("Beep Beep");
    }
}
