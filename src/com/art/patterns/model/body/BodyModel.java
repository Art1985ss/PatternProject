package com.art.patterns.model.body;

/**
 * Decorator pattern implementation
 */
public abstract class BodyModel implements IBody {
    private final Body body;

    protected BodyModel(final Body body) {
        this.body = body;
    }

    @Override
    public String decorate() {
        return body.decorate();
    }
}
