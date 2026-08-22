package com.learn.java;

import java.io.FileNotFoundException;

public class datatype {
    public static void main(String[] args) {
//        long num = 123;
//        int num1 = num;
//        System.out.println(num1);

//        byte num =1;
//        short num2 = (short)num;
//        int num3 =(int) num2;
//        long num4 = (long)num3;
//        System.out.println(num3);

//        int i =1;
//        System.out.println(i-- + i);\
//        car car = new car("green");
//        car.speed(-33);
//        car.speed(45);


        dog dog = new dog();
        dog.sayhello();
        dog.sleep();





    }
}

abstract class Animal {
    abstract void sayhello();
    abstract void sleep();
}

class dog extends Animal {

    @Override
    void sayhello() {
        System.out.println("wofff wofff .. ");
    }

    @Override
    void sleep() {
        System.out.println("zzzzz....");

    }
}

class cat extends Animal {

    @Override
    void sayhello() {
        System.out.println("meao meao ....  ");
    }

    @Override
    void sleep() {
        System.out.println("zzzzz....");

    }
}


interface mobile {
    void calling();
}

interface mobile1{
    void callend();
}

class oppo implements mobile,mobile1 {

    @Override
    public void calling() {
        System.out.println("calling form oppo");
    }

    @Override
    public void callend() {
        System.out.println("calling form oppo is ended");
    }
}
