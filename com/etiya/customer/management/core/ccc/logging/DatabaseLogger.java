package com.etiya.customer.management.core.ccc.logging;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("[Database Logger]: " + message);
    }
}
