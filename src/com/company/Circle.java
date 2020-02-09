package com.company;

public class Circle extends Shape {
    private double radius;


    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String shapecolor, double radius) {
        super(shapecolor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "radius=" + radius;
    }

    @Override
    public double calcArea () {
        double squareCircle = Math.PI * this.radius * this.radius;
        return squareCircle;
    }
}