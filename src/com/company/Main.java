package com.company;

public class Main {

    public static void main(String[] args) {
        Shape[] shape = {
                new Rectangle(5, 2),
                new Rectangle(2, 8),
                new Rectangle(1, 3),
                new Rectangle(2, 3),
                new Circle(2),
                new Circle(5),
                new Circle(3),
                new Triangle(1, 2, 3),
                new Triangle(2, 3, 4)
        };
        allFigure(shape);
        summSquare(shape);
        summFigureSquare(shape);
    }

    public static void allFigure(Shape[] shape) {
        for (Shape all : shape) {
            System.out.println(all);
            System.out.println("Square of figyre: " + all.calcArea());
        }
    }

    public static void summSquare(Shape[] shape) {
        double summ = 0.0;
        for (Shape all : shape) {
            summ = summ + all.calcArea();
        }
        System.out.println("Summa all figures: " + summ);
    }

    public static void summFigureSquare(Shape[] shape) {
        double summ = 0.0;
        for (Shape all : shape) {
            if (all instanceof Circle) {
                summ = summ + all.calcArea();
            }

        }
        System.out.println("Summa This type of figures: " + summ);
    }
}





