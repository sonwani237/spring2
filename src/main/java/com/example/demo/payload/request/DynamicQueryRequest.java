package com.example.demo.payload.request;

import java.util.List;

public class DynamicQueryRequest {
    private QueryDetails queryDetails;

    public QueryDetails getQueryDetails() {
        return queryDetails;
    }

    public void setQueryDetails(QueryDetails queryDetails) {
        this.queryDetails = queryDetails;
    }

    public static class QueryDetails {
        private List<String> agentIds;
        private String collectionName;
        private List<FilterConditions> filters;

        public List<String> getAgentIds() {
            return agentIds;
        }

        public void setAgentIds(List<String> agentIds) {
            this.agentIds = agentIds;
        }

        public String getCollectionName() {
            return collectionName;
        }

        public void setCollectionName(String collectionName) {
            this.collectionName = collectionName;
        }

        public List<FilterConditions> getFilters() {
            return filters;
        }

        public void setFilters(List<FilterConditions> filters) {
            this.filters = filters;
        }
    }

    public static class FilterConditions {
       private String key;
       private String operator;
       private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getOperator() {
            return operator;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }
}
