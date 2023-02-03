package com.etiya.customer.management.core.ccc.logging;

public class ConsoleLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("[Console Logger]: " + message);
    }
}
