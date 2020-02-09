package com.company;

public class Rectangle extends Shape {
    private int width;
    private int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String shapecolor, int width, int height) {
        super(shapecolor);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString()+
                " , width=" + width +
                ", height=" + height;
    }

    @Override
    public double calcArea() {
        double squarerectangle = this.width * this.height;
        return squarerectangle;
    }
}
