package com.art.patterns;

import com.art.patterns.repository.CarRepository;
import com.art.patterns.service.CarFactory;
import com.art.patterns.service.CarNews;

/**
 * Patterns :
 * <ul>
 *     <li>Singleton {@link CarRepository}</li>
 *     <li>Observer {@link CarNews} {@link CarRepository}</li>
 *     <li>Decorator {@link com.art.patterns.model.body.BodyModel BodyModel}</li>
 *     <li>Adapter {@link com.art.patterns.model.ISpeedAdapter ISpeedAdapter}</li>
 *     <li>Facade {@link CarFactory}</li>
 * </ul>
 */
public class Main {
    public static void main(String[] args) {
        CarNews carNews = new CarNews();
        CarRepository carRepository = CarRepository.getInstance();
        carRepository.addPropertyChangeListener(carNews);

        for (int i = 0; i < 15; i++) {
            carRepository.addCar(CarFactory.createCar());
        }
    }
}
