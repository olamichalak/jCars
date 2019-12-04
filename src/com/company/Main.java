package com.company;

public class Main {

    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
	    Sport sport = new Sport();

	    Vehicle[] vehicles = {vehicle, car, sport};

        for (Vehicle temp: vehicles)
        {
            if(temp instanceof Sport) //jesli zamieni sie kolejnosc ifów i elsifów to nie wykona się odpowiedni warunek!
            {
                Sport sc = (Sport)temp; // np Sport jest instance of Car! TRUE!
                sc.go();
                sc.horn();
                sc.turbo();
            }
            else if(temp instanceof Car)
            {
                Car c = (Car)temp;
                c.go();
                c.horn();
            }
            else
                temp.go();
        }
    }
}
