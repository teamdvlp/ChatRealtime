package com.example.tiend.chatrealtime.model;

/**
 * Created by tiend on 8/17/2017.
 */

public class Message {
    private String content;
    private double time;
    private String sender;
    private String receiver;

    public Message () {

    }

    public Message(String content, double time, String sender, String receiver) {
        this.content = content;
        this.time = time;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
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
}
