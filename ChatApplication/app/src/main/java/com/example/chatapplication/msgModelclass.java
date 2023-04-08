package com.example.chatapplication;

public class msgModelclass {

    String messsage;
    String Senderid;
    long timeStamp;

    public msgModelclass() {
    }

    public msgModelclass(String messsage, String senderid, long timeStamp) {
        this.messsage = messsage;
        Senderid = senderid;
        this.timeStamp = timeStamp;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public String getSenderid() {
        return Senderid;
    }

    public void setSenderid(String senderid) {
        Senderid = senderid;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
