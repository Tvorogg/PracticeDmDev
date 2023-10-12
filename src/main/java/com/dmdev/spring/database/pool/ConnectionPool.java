package com.dmdev.spring.database.pool;

import org.springframework.beans.factory.InitializingBean;

import java.util.List;
import java.util.Map;

public class ConnectionPool implements InitializingBean {
    private final String username;
    private final String poolsize;
    private final List<Object> args;
    private Map<String, Object>properties;

    public ConnectionPool(String username, String poolsize, List<Object> args, Map<String, Object> properties) {
        this.username = username;
        this.poolsize = poolsize;
        this.args = args;
        this.properties = properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }
    private void init(){
        System.out.println("Init connection pool");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("properties set");
    }
}
