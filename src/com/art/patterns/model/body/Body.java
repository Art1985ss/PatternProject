package com.art.patterns.model.body;

public record Body(String color, int doorCount) implements IBody {
    @Override
    public String toString() {
        return "{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                '}';
    }

    @Override
    public String decorate() {
        return toString();
    }
}
