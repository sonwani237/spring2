package com.example.demo.payload.request;

import java.util.Set;

public class AgentUserRequest {
    private String agentId;
    private Set<String> userId;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Set<String> getUserId() {
        return userId;
    }

    public void setUserId(Set<String> userId) {
        this.userId = userId;
    }
}
