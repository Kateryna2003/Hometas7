package com.company;

public class Shape {
    private String shapecolor;

    public Shape() {
    }


    public Shape(String shapecolor) {
        this.shapecolor = shapecolor;
    }

    public String getShapecolor() {
        return shapecolor;
    }

    public void setShapecolor(String shapecolor) {
        this.shapecolor = shapecolor;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": shapecolor='" + shapecolor;
    }


    public double calcArea() {
        double square = 0;
        return square;
    }

}