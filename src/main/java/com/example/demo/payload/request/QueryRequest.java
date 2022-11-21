package com.example.demo.payload.request;

import java.util.List;

public class QueryRequest {
    private String name;
    private List<DynamicQueryRequest.QueryDetails> query;
    private String userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DynamicQueryRequest.QueryDetails> getQuery() {
        return query;
    }

    public void setQuery(List<DynamicQueryRequest.QueryDetails> query) {
        this.query = query;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
