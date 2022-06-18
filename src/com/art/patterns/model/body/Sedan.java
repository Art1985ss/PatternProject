package com.art.patterns.model.body;

public class Sedan extends BodyModel{
    public Sedan(final Body body) {
        super(body);
    }

    @Override
    public String decorate() {
        return this + super.decorate();
    }

    @Override
    public String toString() {
        return "Sedan";
    }
}
