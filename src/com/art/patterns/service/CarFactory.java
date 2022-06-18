package com.art.patterns.service;

import com.art.patterns.model.Car;
import com.art.patterns.model.Engine;
import com.art.patterns.model.EngineType;
import com.art.patterns.model.body.Body;
import com.art.patterns.model.body.IBody;
import com.art.patterns.model.body.Sedan;
import com.art.patterns.model.body.Universal;

import java.util.List;
import java.util.Random;

/**
 * Facade pattern example
 */
public class CarFactory {
    private static final List<String> colors = List.of("Red", "Blue", "White", "Yellow");
    private static final Random random = new Random();

    private CarFactory() {
    }

    public static Car createCar() {
        final Body body = new Body(colors.get(random.nextInt(colors.size())), random.nextInt(5));
        IBody iBody;
        if (random.nextBoolean()) {
            iBody = new Sedan(body);
        } else {
            iBody = new Universal(body);
        }
        return new Car(iBody, new Engine(EngineType.values()[random.nextInt(EngineType.values().length - 1)]), random.nextInt(200) + 100);
    }
}
