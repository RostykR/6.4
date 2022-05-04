package com.company;

public class Control {
    int speed;
    int height;
    int incline;


    public Control(int speed,int height,int incline){
        this.speed = speed;
        this.height = height;
        this.incline = incline;
    }

    void speedUp(){
        int s = speed + 50;
        System.out.print(" Політ почався,швидкість на даний момент " + s);
    }

    int heightUp(){
        int h;
        h = height + 700;
        return h;

    }

}
