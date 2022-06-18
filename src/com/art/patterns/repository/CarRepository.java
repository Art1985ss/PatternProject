package com.art.patterns.repository;

import com.art.patterns.model.Car;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 * Example of singleton implementation
 */
public class CarRepository {
    private static CarRepository instance;
    private final List<Car> carList;
    private final PropertyChangeSupport propertyChangeSupport;
    private int carsCount = 0;

    private CarRepository() {
        propertyChangeSupport = new PropertyChangeSupport(this);
        carList = new ArrayList<>();
    }

    public static CarRepository getInstance() {
        if (instance == null) {
            instance = new CarRepository();
        }
        return instance;
    }

    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void addCar(final Car car) {
        propertyChangeSupport.firePropertyChange("carsCount", carsCount++, carsCount);
        propertyChangeSupport.firePropertyChange("car", null, car);
        carList.add(car);
    }

}
