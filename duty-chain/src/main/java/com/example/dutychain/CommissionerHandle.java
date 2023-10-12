package com.example.dutychain;


public class CommissionerHandle extends Handler {

    @Override
    public void handleRequest(int i) {
        if(i >= 3 && i <= 5){
            System.out.println("总监批准了我"+i+"天假期。");
        }else{

            if(getHandle() != null){
                getHandle().handleRequest(i);
            }else{
                System.out.println("完了，找不到人批准了");
            }

        }
    }
}
