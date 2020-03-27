package org.fasttrackit;

public class Autovehicle extends Vehicle {

    // "has-a" relationship / Aggregation
    Engine engine;

    public Autovehicle(Engine engine) {
        this.engine = engine;
    }
}

