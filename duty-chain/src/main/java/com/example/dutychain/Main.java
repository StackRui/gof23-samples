package com.example.dutychain;


public class Main {
    public static void main(String[] agr) {
        Handler teamLeaderHandle = new TeamLeaderHandle();
        Handler commissionerHandle = new CommissionerHandle();
        Handler generalManagerHandler = new GeneralManagerHandler();

        teamLeaderHandle.setHandle(commissionerHandle);
        commissionerHandle.setHandle(generalManagerHandler);
        teamLeaderHandle.handleRequest(10);
    }
}
