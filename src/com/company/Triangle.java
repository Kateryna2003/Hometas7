package com.company;

public class Triangle extends Shape {
    private int sidea;
    private int sideb;
    private int sidec;

    public Triangle(int sidea, int sideb, int sidec) {
        this.sidea = sidea;
        this.sideb = sideb;
        this.sidec = sidec;
    }

    public Triangle(String shapecolor, int sidea, int sideb, int sidec) {
        super(shapecolor);
        this.sidea = sidea;
        this.sideb = sideb;
        this.sidec = sidec;
    }

    @Override
    public String toString() {
        return super.toString()+
                " sidea=" + sidea +
                " , sideb=" + sideb +
                " , sidec=" + sidec;
    }

    @Override
    public double calcArea() {
        double perim = ( this.sidea + this.sideb + this.sidec)/2 ;
        double squaretrian = Math.sqrt((perim * (perim - this.sidea) * (perim - this.sideb) * (perim - this.sidec)));
        return squaretrian;
    }
}
