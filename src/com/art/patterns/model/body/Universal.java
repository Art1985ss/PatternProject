package com.art.patterns.model.body;

public class Universal extends BodyModel {
    public Universal(final Body body) {
        super(body);
    }

    @Override
    public String decorate() {
        return this + super.decorate();
    }

    @Override
    public String toString() {
        return "Universal";
    }
}
