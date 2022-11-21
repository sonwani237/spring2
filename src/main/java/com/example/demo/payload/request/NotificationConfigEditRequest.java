package com.example.demo.payload.request;

import java.util.List;

public class NotificationConfigEditRequest {
    private String id;
    private String senderAddress;
    private String password;
    private List<String> receiverAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
