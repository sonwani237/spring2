package com.example.demo.payload.response;


public class ResponseModel {
    private boolean status;
    private String message;
    private String errorMessage;
    private Object response;

    public ResponseModel(boolean mStatus, String mMessage, String mErrorMessage, Object data) {
        this.status = mStatus;
        this.message = mMessage;
        this.errorMessage = mErrorMessage;
        this.response = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }
}
