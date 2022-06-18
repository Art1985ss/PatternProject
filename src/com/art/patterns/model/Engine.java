package com.art.patterns.model;

public record Engine(EngineType type) {
    @Override
    public String toString() {
        return "Engine{" +
                "type=" + type +
                '}';
    }
}
