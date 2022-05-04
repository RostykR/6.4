package com.company;

public class Pilot {
    int weight;
    int courage;
    int age;



    public Pilot(int weight,int courage,int age){
        this.weight = weight;
        this.courage = courage;
        this.age = age;
    }


    void readySt(){
        int r = courage + 20;
        System.out.print(" Пілот готовий до подорожі,його сміливість збільшилась на = " + r);

    }

    int weightDown(){
        int w;
        w = weight - 3;
        return w;
    }

}
