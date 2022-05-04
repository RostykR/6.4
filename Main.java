package com.company;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(0, 0, 1000);
        Control control = new Control(0, 0, 0);
        Pilot pilot = new Pilot(70, 100, 35);


        Engine engine1 = new Engine(0, 0, 1000);
        System.out.println(" Двигун запущено,температура збільшилась на = " + engine1.startEngine());
        engine1.startOil();


        Control control1 = new Control(0, 0, 0);
        System.out.println(" Висота на даний момент = " + control1.heightUp());
        control1.speedUp();


        Pilot pilot1 = new Pilot(70,100,35);
        System.out.println(" Вага зменшилась на = " + pilot1.weightDown());
        pilot1.readySt();

    }
}
