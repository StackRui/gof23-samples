package com.example.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator chatRoom = new ChatRoomMediator();

        User user1 = new ChatUser(chatRoom, "小明");
        User user2 = new ChatUser(chatRoom, "小红");
        User user3 = new ChatUser(chatRoom, "小刚");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("大家好");
        user2.send("小明，你好");
        user3.send("小红，你好");
    }
}
