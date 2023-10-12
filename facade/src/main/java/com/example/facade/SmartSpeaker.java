package com.example.facade;

public class SmartSpeaker {
    private final Light light;
    private final Tv tv;
    private final Fan fan;

    public SmartSpeaker() {
        light = new Light();
        tv = new Tv();
        fan = new Fan();
    }

    public void say(String order) {
        if (order.contains("起床")) {
            getUp();
        } else if (order.contains("睡觉")) {
            sleep();
        } else {
            System.out.println("我还听不懂你说的啥！");
        }
    }

    public void getUp() {
        System.out.println("起床");
        light.on();
        tv.on();
        fan.off();
    }

    public void sleep() {
        System.out.println("睡觉");
        light.off();
        tv.off();
        fan.on();
    }
}
