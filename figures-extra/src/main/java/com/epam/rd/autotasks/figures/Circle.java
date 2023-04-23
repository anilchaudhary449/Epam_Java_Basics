package com.epam.rd.autotasks.figures;

import static java.lang.Math.*;

class Circle extends Figure{

    public Point center;
    public double radius;

    public Circle(Point center, double radius){
        if(radius<= 0 || center == null) throw new IllegalArgumentException();
        this.center = center;
        this.radius = radius;
        if(area()==0) throw new IllegalArgumentException();
    }
    public double roundTo2DecimalPlace(double value) {
        return Math.round(value * 1000.0) / 1000.0;
    }

    public Point getCenter(){
        return center;
    }

    public double getRadius(){
        return radius;
    }

    public double area(){
        return PI * pow(radius,2);
    }

    @Override
    public Point centroid(){
        return center;
    }
    @Override
    public boolean isTheSame(Figure figure){
        if(figure instanceof Circle){
            Circle otherCircle = (Circle) figure;
            return roundTo2DecimalPlace(center.getX())  == roundTo2DecimalPlace(otherCircle.center.getX())
                    && roundTo2DecimalPlace(center.getY()) == roundTo2DecimalPlace(otherCircle.center.getY()) && roundTo2DecimalPlace(radius) == roundTo2DecimalPlace(otherCircle.radius);
        }
        else return false;
    }

}