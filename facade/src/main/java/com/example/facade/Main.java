package com.example.facade;

public class Main {
    public static void main(String[] args) {
        SmartSpeaker smartSpeaker = new SmartSpeaker();
        System.out.println(">>>>>>>>>>>>>>>>我要睡觉了!");
        //睡觉
        //关灯
        //关电视
        //开风扇
        smartSpeaker.say("我要睡觉了!");
        System.out.println(">>>>>>>>>>>>>>>>我起床了!");
        //起床
        //开灯
        //开电视
        //关风扇
        smartSpeaker.say("我起床了!");
    }
}
