package com.company;

public class Sport extends Car
{
    public Sport()
    {
        //System.out.println("konstruktor sport");
    }

    @Override
    public void go() {
        //super.go();
        System.out.println("Go sport");
    }

    void turbo()
    {
        System.out.println("Gwałtowne przyspieszenie");
    }
}
