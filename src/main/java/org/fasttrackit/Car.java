package org.fasttrackit;

public class Car extends Autovehicle {
     // "is-a" relationship / inheritance

    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }
}
