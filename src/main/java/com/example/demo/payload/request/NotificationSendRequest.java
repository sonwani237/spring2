package com.example.demo.payload.request;

public class NotificationSendRequest {
    private String threshold;
    private double usedPer;
    private String agentId;
    private String notificationType;

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    public double getUsedPer() {
        return usedPer;
    }

    public void setUsedPer(double usedPer) {
        this.usedPer = usedPer;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }
}
