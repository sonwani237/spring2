package com.example.demo.payload.response;

import com.winect.service_manager.model.ManagerLogs;

import java.util.List;

public class ManagerLogsResponse {
    private long count;
    private List<ManagerLogs> managerLogs;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<ManagerLogs> getManagerLogs() {
        return managerLogs;
    }

    public void setManagerLogs(List<ManagerLogs> managerLogs) {
        this.managerLogs = managerLogs;
    }
}
