package com.art.patterns.model;

import com.art.patterns.model.body.IBody;

public record Car(IBody body, Engine engine, int maxSpeed) implements Speed {
    @Override
    public String toString() {
        return "Car{" +
                "body=" + body.decorate() +
                ", engine=" + engine +
                ", maxSpeedKM=" + maxSpeed +
                String.format(", maxSpeedMPH=%.2f", new SpeedAdapterToMPH(this).getSpeed()) +
                '}';
    }

    @Override
    public double getSpeed() {
        return maxSpeed;
    }
}
