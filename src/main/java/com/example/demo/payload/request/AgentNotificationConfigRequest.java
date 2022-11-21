package com.example.demo.payload.request;

public class AgentNotificationConfigRequest {
    private String notificationType;
    private long schedule;
    private int thresholdValue;
    private int normalValue;
    private int infoStartValue;
    private int infoEndValue;
    private int warnStartValue;
    private int warnEndValue;

    public AgentNotificationConfigRequest(String notificationType, long schedule, int thresholdValue, int normalValue, int infoStartValue, int infoEndValue, int warnStartValue, int warnEndValue) {
        this.notificationType = notificationType;
        this.schedule = schedule;
        this.thresholdValue = thresholdValue;
        this.normalValue = normalValue;
        this.infoStartValue = infoStartValue;
        this.infoEndValue = infoEndValue;
        this.warnStartValue = warnStartValue;
        this.warnEndValue = warnEndValue;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
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

    public long getSchedule() {
        return schedule;
    }

    public void setSchedule(long schedule) {
        this.schedule = schedule;
    }
}
