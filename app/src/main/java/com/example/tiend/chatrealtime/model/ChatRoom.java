package com.example.tiend.chatrealtime.model;

import java.util.ArrayList;

/**
 * Created by tiend on 8/17/2017.
 */

public class ChatRoom {
    private String id;
    private String sender;
    private String receiver;
    private ArrayList<Message> messages;

    public ChatRoom(String id, String sender, String receiver, ArrayList<Message> messages) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.messages = messages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}
