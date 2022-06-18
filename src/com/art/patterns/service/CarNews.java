package com.art.patterns.service;

import com.art.patterns.model.Car;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Observer pattern implementation
 * This class getting its news from {@link com.art.patterns.repository.CarRepository}
 */
public class CarNews implements PropertyChangeListener {
    /**
     * Informing about number of cars in repository. Whines when too many cars are there
     *
     * @param evt A PropertyChangeEvent object describing the event source
     *            and the property that has changed.
     */
    @Override
    public void propertyChange(final PropertyChangeEvent evt) {
        if (evt.getNewValue() instanceof Car car) {
            System.out.println("New car has been made! " + car);
        } else {
            System.out.println("Now there are " + evt.getNewValue() + " cars in the world! Instead of " + evt.getOldValue());
            if (((Integer) evt.getNewValue()) >= 10)
                System.out.println("It seems there are too many cars around here!");
        }
    }
}
