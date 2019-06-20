package com.microservicios.demo;

import com.microservicios.demo.animals.OsoHormiguero;

public class Application {

    public static void main(String[] args)
    {
        System.out.println("Hello taxonomy");
        OsoHormiguero osoHormiguero = new OsoHormiguero();
        osoHormiguero.move();
        osoHormiguero.makeNoise();
        osoHormiguero.eat();
        osoHormiguero.run();
    }

}