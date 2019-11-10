package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double side;
    double altitude;

    public Triangle(double side, double altitude) {
        this.side = side;
        this.altitude = altitude;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (side * altitude) / 2;
    }
}
