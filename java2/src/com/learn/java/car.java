package com.learn.java;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.sql.SQLOutput;

public class car {
    private String color;
    private int speed;

    public car(String color)
    {
        this.color = color;
    }

    public void speed(int speed){
        if(speed<0){
            System.out.println("not possible");
        }else{
            System.out.println("driving at : "+speed);
            this.speed = speed;
        }
    }

    public void drive(){
        System.out.println("driving....");
    }
}
