package com.microservicios.demo;

import com.microservicios.demo.animals.OsoHormiguero;
import com.microservicios.demo.interfaces.LandAnimal;

public class Application {

    public static void main(String[] args)
    {
        System.out.println("Hello taxonomy");
        LandAnimal osoHormiguero = new OsoHormiguero();
        osoHormiguero.move();
        osoHormiguero.makeNoise();
        osoHormiguero.eat();
        osoHormiguero.run();
    }

}