package com.example.demo.payload.request;

import java.util.List;

public class NotificationConfigRequest {
    private String channelId;
    private String senderAddress;
    private String password;
    private List<String> receiverAddress;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(List<String> receiverAddress) {
        this.receiverAddress = receiverAddress;
    }
}
