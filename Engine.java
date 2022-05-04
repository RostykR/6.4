package com.company;

public class Engine {
    int temperature;
    int power;
    int oil;


    public Engine(int temperature,int power,int oil){
        this.temperature = temperature;
        this.oil = oil;
        this.power = power;
    }

    void startOil(){
        int o = oil - 30;
        System.out.print(" Пальне потрапило в двигун,залишок пального = "+ o);
    }


    int startEngine(){
        int s;
        s = temperature + 300;
        return s;
    }
}
