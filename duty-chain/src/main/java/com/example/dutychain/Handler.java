package com.example.dutychain;

public abstract class Handler {
    private Handler handler;

    public void setHandle(Handler handler) {
        this.handler = handler;
    }

    public Handler getHandle() {
        return handler;
    }
    public abstract void handleRequest(int i);
}
