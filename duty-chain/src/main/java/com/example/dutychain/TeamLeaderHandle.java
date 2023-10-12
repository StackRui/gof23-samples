package com.example.dutychain;


public class TeamLeaderHandle extends Handler {

    @Override
    public void handleRequest(int i) {
        if(i < 3){
            System.out.println("组长批准了我"+i+"天假期。");
        }else{

            if(getHandle() != null){
                getHandle().handleRequest(i);
            }else{
                System.out.println("完了，找不到人批准了");
            }

        }
    }
}

