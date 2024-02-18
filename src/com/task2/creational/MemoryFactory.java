package com.task2.creational;

public class MemoryFactory {
    private static MemoryFactory uniqueInstance;

    protected MemoryFactory() {}

    public static MemoryFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MemoryFactory();
        }
        return uniqueInstance;
    }
}
