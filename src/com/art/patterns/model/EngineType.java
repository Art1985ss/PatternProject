package com.art.patterns.model;

public enum EngineType {
    GASOLINE("Gasoline"), DIESEL("Diesel"), GAS("Gas"), ELECTRIC("Electric");

    private final String descr;

    EngineType(final String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return descr;
    }
}
