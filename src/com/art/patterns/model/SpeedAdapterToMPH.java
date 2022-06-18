package com.art.patterns.model;

/**
 * Adapter pattern example
 */
public class SpeedAdapterToMPH implements ISpeedAdapter{
    protected static final double MPH = 0.621371;
    private final Car car;

    public SpeedAdapterToMPH(final Car car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return car.getSpeed() * MPH;
    }
}
