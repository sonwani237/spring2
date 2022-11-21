package com.example.demo.payload.request;


import java.util.List;

public class NotificationCreateRequest {
    private List<String> notificationConfigId;
    private String agentId;
    private String thresholdItemId;
    private String message;
    private String thresholdMessage;
    private long schedule;
    private int thresholdValue;
    private int normalValue;
    private int infoStartValue;
    private int infoEndValue;
    private int warnStartValue;
    private int warnEndValue;

    public List<String> getNotificationConfigId() {
        return notificationConfigId;
    }

    public void setNotificationConfigId(List<String> notificationConfigId) {
        this.notificationConfigId = notificationConfigId;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getThresholdItemId() {
        return thresholdItemId;
    }

    public void setThresholdItemId(String thresholdItemId) {
        this.thresholdItemId = thresholdItemId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getThresholdMessage() {
        return thresholdMessage;
    }

    public void setThresholdMessage(String thresholdMessage) {
        this.thresholdMessage = thresholdMessage;
    }

    public long getSchedule() {
        return schedule;
    }

    public void setSchedule(long schedule) {
        this.schedule = schedule;
    }

    public int getThresholdValue() {
        return thresholdValue;
    }

    public void setThresholdValue(int thresholdValue) {
        this.thresholdValue = thresholdValue;
    }

    public int getNormalValue() {
        return normalValue;
    }

    public void setNormalValue(int normalValue) {
        this.normalValue = normalValue;
    }

    public int getInfoStartValue() {
        return infoStartValue;
    }

    public void setInfoStartValue(int infoStartValue) {
        this.infoStartValue = infoStartValue;
    }

    public int getInfoEndValue() {
        return infoEndValue;
    }

    public void setInfoEndValue(int infoEndValue) {
        this.infoEndValue = infoEndValue;
    }

    public int getWarnStartValue() {
        return warnStartValue;
    }

    public void setWarnStartValue(int warnStartValue) {
        this.warnStartValue = warnStartValue;
    }

    public int getWarnEndValue() {
        return warnEndValue;
    }

    public void setWarnEndValue(int warnEndValue) {
        this.warnEndValue = warnEndValue;
    }
}
